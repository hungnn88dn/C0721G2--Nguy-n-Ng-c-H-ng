package service;


import models.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService{
    public void insertUser(Employee employee) throws SQLException;

    public Employee selectEmployee(int id);

    public List<Employee> selectAllEmployees();


    public boolean deleteEmployee(int id) throws SQLException;

    public boolean updateEmployee(Employee employee) throws SQLException;
}
