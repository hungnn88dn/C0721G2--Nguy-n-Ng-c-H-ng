package service.impl;

import models.Employee;
import repository.EmployeeServiceRepo;
import repository.impl.EmployeeRepoImpl;
import service.EmployeeService;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeServiceRepo employeeService = new EmployeeRepoImpl();

    @Override
    public void insertUser(Employee employee) throws SQLException {
          this.employeeService.insertUser(employee);
    }

    @Override
    public Employee selectEmployee(int id) {
        return null;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        return this.employeeService.selectAllEmployees();
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return false;
    }
}
