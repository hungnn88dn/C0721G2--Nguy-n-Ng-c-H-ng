package casestudy.furama4.service;


import casestudy.furama4.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService{
    public List<Employee> findAll();
    public Employee findById(int id);
    Employee save(Employee employee);
    void delete(Employee employee);
    void deleteById(int id);
    public Page<Employee> findAllEmployee(Pageable pageable);
    public Page<Employee> findAllEmployeeByName(String name,Pageable pageable);
    public boolean exitEmail(String email);
}
