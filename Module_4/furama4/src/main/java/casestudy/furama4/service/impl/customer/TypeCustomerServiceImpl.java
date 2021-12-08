package casestudy.furama4.service.impl.customer;

import casestudy.furama4.models.Customer;
import casestudy.furama4.models.TypeCustomer;
import casestudy.furama4.repository.customer.TypeCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCustomerServiceImpl {
    @Autowired
    TypeCustomerRepository typeCustomerRepository;

    public List<TypeCustomer> findAll(){
        return typeCustomerRepository.findAll();
    }
}
