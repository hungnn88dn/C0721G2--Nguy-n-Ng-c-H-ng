package casestudy.furama4.repository.employee;

import casestudy.furama4.models.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
