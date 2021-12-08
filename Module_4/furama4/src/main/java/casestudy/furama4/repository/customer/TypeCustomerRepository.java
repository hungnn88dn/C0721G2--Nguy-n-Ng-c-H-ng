package casestudy.furama4.repository.customer;

import casestudy.furama4.models.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer,Integer> {

}
