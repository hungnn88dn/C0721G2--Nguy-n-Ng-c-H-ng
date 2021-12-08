package casestudy.furama4.repository.customer;


import casestudy.furama4.models.Customer;
import casestudy.furama4.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findCustomerByNameContaining(String name, Pageable pageable);
}
