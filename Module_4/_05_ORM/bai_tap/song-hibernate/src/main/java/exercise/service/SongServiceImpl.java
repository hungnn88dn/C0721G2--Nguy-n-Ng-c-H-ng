package exercise.service;

import exercise.model.Song;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Song> findAll() {
        String queryStr = "SELECT s FROM song AS s";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
        return query.getResultList();
    }

    @Override
    public Song findOne(int id) {
        return SongServiceImpl.entityManager.find(Song.class, id);
    }

    @Override
    public Song save(Song song) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Song origin = findOne(song.getId());
            origin.setName(song.getName());
            origin.setArtist(song.getArtist());
            origin.setCategory(song.getCategory());
            origin.setUrl(song.getUrl());
            session.saveOrUpdate(origin);
            transaction.commit();
            return origin;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public List<Song> save(List<Song> customers) {
        return null;
    }


    @Override
    public void delete(int id) {
        String hql = "DELETE FROM song WHERE id = :id";
        Query query = entityManager.createQuery(hql);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void delete(List<Song> songs) {

    }

    @Override
    public void create(Song song) {
        EntityTransaction entityTransaction= SongServiceImpl.entityManager.getTransaction();
        entityTransaction.begin();
        SongServiceImpl.entityManager.persist(song);
        entityTransaction.commit();
    }
}
