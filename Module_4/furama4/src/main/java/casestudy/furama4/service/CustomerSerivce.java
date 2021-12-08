package casestudy.furama4.service;


import casestudy.furama4.models.Customer;
import casestudy.furama4.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerSerivce  {
    public List<Customer> findAll();
    public Customer findById(int id);
    Customer save(Customer customer);
    void delete(Customer customer);
    void deleteById(int id);
    public Page<Customer> findAllCustomer(Pageable pageable);
    public Page<Customer> findAllCustomerByName(String name,Pageable pageable);
}
