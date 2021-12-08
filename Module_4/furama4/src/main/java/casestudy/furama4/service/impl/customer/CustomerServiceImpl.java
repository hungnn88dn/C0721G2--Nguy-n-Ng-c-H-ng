package casestudy.furama4.service.impl.customer;


import casestudy.furama4.models.Customer;
import casestudy.furama4.repository.customer.CustomerRepository;
import casestudy.furama4.service.CustomerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerSerivce {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
         this.customerRepository.delete(customer);
    }

    @Override
    public void deleteById(int id) {
       this.customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return this.customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllCustomerByName(String name, Pageable pageable) {
        return this.customerRepository.findCustomerByNameContaining(name,pageable);
    }
}
