package exercise.demo.repository;

import exercise.demo.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowRepository  extends JpaRepository<Borrow, Integer> {
}
