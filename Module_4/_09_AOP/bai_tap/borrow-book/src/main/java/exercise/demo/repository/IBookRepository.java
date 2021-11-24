package exercise.demo.repository;

import exercise.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findBookByAuthorContaining(String author, Pageable pageable);
    Page<Book> findBookByNameContaining(String name, Pageable pageable);

    @Query(value= "select * from book  where id = :id" , nativeQuery= true)
    Page<Book> findAllBookByECommerceId(@Param("id") int id, Pageable pageable );
}
