package service.impl;

import models.Customer;
import repository.CustomerSerivceRepo;
import repository.impl.CustomerRepoImpl;
import service.CustomerSerivce;
import java.sql.SQLException;
import java.util.List;


public class CustomerServiceImpl implements CustomerSerivce {
    CustomerSerivceRepo customerSerivceRepo = new CustomerRepoImpl();

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        this.customerSerivceRepo.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return this.customerSerivceRepo.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return false;
    }
}
