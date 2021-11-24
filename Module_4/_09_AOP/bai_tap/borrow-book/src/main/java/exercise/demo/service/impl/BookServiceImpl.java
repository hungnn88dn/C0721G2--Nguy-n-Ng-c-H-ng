package exercise.demo.service.impl;

import exercise.demo.model.Book;
import exercise.demo.repository.IBookRepository;
import exercise.demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return iBookRepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return iBookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
         iBookRepository.delete(book);
    }

    @Override
    public Page<Book> findAllBook(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public Page<Book> findAllBookByName(String name, Pageable pageable) {
        return iBookRepository.findBookByNameContaining(name,pageable);
    }

    @Override
    public Page<Book> findAllBookByAuthor(String author, Pageable pageable) {
        return iBookRepository.findBookByAuthorContaining(author,pageable);
    }

    @Override
    public Page<Book> findAllBookByEcommerceId(int id, Pageable pageable) {
        return iBookRepository.findAllBookByECommerceId(id,pageable);
    }
}
