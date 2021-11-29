package exercise.flower.service;

import exercise.flower.model.Bill;
import org.springframework.stereotype.Service;

@Service
public interface BillService {
    Iterable<Bill> findAll();
    Bill save(Bill bill);
}
