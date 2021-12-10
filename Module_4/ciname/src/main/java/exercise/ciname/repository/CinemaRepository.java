package exercise.ciname.repository;

import exercise.ciname.model.Cinema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
    @Query(value= "select * from cinema join film where cinema.film_id = film.id and film.id = :id" , nativeQuery= true)
    Page<Cinema> findAllCinemaByFilmId(@Param("id") int id, Pageable pageable );
}
