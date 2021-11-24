package exercise.demo.service.impl;

import exercise.demo.model.Borrow;
import exercise.demo.repository.IBorrowRepository;
import exercise.demo.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowServiceImpl implements IBorrowService {

    @Autowired
    IBorrowRepository iBorrowRepository;

    @Override
    public List<Borrow> findAll() {
        return iBorrowRepository.findAll();
    }

    @Override
    public Borrow findById(int id) {
        return iBorrowRepository.findById(id).orElse(null);
    }

    @Override
    public Borrow save(Borrow borrow) {
        return iBorrowRepository.save(borrow);
    }

    @Override
    public void delete(Borrow borrow) {
        iBorrowRepository.delete(borrow);
    }

    @Override
    public Page<Borrow> findAllBorrow(Pageable pageable) {
        return iBorrowRepository.findAll(pageable);
    }

    @Override
    public Page<Borrow> findAllBorrowByName(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Borrow> findAllBorrowByEcommerceId(int id, Pageable pageable) {
        return null;
    }
}
