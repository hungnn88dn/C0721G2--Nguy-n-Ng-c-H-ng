package casestudy.furama4.models;
import casestudy.furama4.repository.UserRepository;
import casestudy.furama4.service.EmployeeService;
import casestudy.furama4.service.impl.employee.EmployeeServiceImpl;
import casestudy.furama4.service.impl.employee.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import javax.persistence.*;
import javax.validation.constraints.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Component
@Entity
public class Employee implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Pattern(regexp = "^[A-Z]\\w+(\\s[A-Z]\\w+)+",
            message = "Ten sai dinh dang, ex: Nguyen Hung ")
    private String name;
    @NotBlank
    @NotEmpty
    private String age;
    @Pattern(regexp = "\\d{9}",
            message = "cmnd phai du 9 so")
    private String cmnd;
    @Min(0)
    private String salary;
    @Pattern(regexp = "0\\d{9}",
            message = "Phone phai 10 so bat dau bang 0 ")
    private String phone;
    @Pattern(regexp = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$",
            message = "Email phai dung dinh dang abc@xyz.com ")
    private String email;
    @NotBlank
    @NotEmpty
    private String address;

    @ManyToOne(targetEntity = Position.class, fetch = FetchType.EAGER)
    private Position position;

    @ManyToOne(targetEntity = Level.class, fetch = FetchType.EAGER)
    private Level level;

    @ManyToOne(targetEntity = Division.class, fetch = FetchType.EAGER)
    private Division division;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;

    @OneToOne(targetEntity = User.class)
    private User user;


    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        LocalDate today = LocalDate.now();
        try {
            Date dayOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(employee.getAge());
            if (dayOfBirth.getYear() - today.getYear() < 18) {
                errors.rejectValue("age","age.length");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
