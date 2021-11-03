package service.impl;

import models.Customer;
import service.CustomerSerivce;
import java.sql.SQLException;
import java.util.List;


public class CustomerServiceImpl implements CustomerSerivce {


    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return null;
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
