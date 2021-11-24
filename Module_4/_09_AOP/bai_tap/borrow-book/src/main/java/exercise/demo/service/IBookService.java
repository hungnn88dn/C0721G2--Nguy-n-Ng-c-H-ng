package exercise.demo.service;

import exercise.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService {
    public List<Book> findAll();
    public Book findById(int id);
    Book save(Book book);
    void delete(Book book);
    public Page<Book> findAllBook(Pageable pageable);
    public Page<Book> findAllBookByName(String name,Pageable pageable);
    public Page<Book> findAllBookByAuthor(String author,Pageable pageable);
    public Page<Book> findAllBookByEcommerceId(int id,Pageable pageable);
}
