package casestudy.furama4.repository.employee;


import casestudy.furama4.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findEmployeeByNameContaining(String name, Pageable pageable);
    boolean existsByEmail(String email);
}
