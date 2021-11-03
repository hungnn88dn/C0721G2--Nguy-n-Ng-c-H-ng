package repository;


import models.Customer;
import models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface CustomerSerivceRepo  {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer selectCustomer(int id);

    public List<Customer> selectAllCustomer();


    public boolean deleteCustomer(int id) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;
}
