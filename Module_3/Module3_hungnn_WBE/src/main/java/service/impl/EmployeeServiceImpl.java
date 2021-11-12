package service.impl;

import models.Employee;
import repository.EmployeeServiceRepo;
import repository.impl.EmployeeRepoImpl;
import service.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeServiceRepo employeeService = new EmployeeRepoImpl();

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
          this.employeeService.insertEmployee(employee);
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
        return this.employeeService.deleteEmployee(id);
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return this.employeeService.updateEmployee(employee);
    }
}
