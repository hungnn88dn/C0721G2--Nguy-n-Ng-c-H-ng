package exercise.demo.service;

import exercise.demo.model.Book;
import exercise.demo.model.Borrow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBorrowService {
    public List<Borrow> findAll();
    public Borrow findById(int id);
    Borrow save(Borrow borrow);
    void delete(Borrow borrow);
    public Page<Borrow> findAllBorrow(Pageable pageable);
    public Page<Borrow> findAllBorrowByName(String name,Pageable pageable);
    public Page<Borrow> findAllBorrowByEcommerceId(int id,Pageable pageable);
}
