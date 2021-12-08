package casestudy.furama4.service.impl.employee;


import casestudy.furama4.models.Employee;
import casestudy.furama4.models.User;
import casestudy.furama4.repository.UserRepository;
import casestudy.furama4.repository.employee.EmployeeRepository;
import casestudy.furama4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee save(Employee employee) {
        this.employeeRepository.save(employee);
        User user= userRepository.findByUsername(employee.getEmail());
        employee.setUser(user);
        return this.employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        this.employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findAllEmployeeByName(String name, Pageable pageable) {
        return this.employeeRepository.findEmployeeByNameContaining(name,pageable);
    }

    @Override
    public boolean exitEmail(String email) {
        return employeeRepository.existsByEmail(email);
    }
}
