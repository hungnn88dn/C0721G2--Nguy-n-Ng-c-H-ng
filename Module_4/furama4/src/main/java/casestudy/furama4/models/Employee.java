package casestudy.furama4.models;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import javax.persistence.*;
import javax.validation.constraints.*;

import java.util.List;
@Component
@Entity
public class Employee implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @NotEmpty
    @Size(min = 5, max = 45)
    private String name;
    @NotBlank
    @NotEmpty
    private String age;
    @Pattern(regexp = "\\d{9}",
            message = "cmnd phai du 9 so")
    private String cmnd;

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

    @ManyToOne(targetEntity = Position.class,fetch = FetchType.EAGER)
    private Position position;

    @ManyToOne(targetEntity = Level.class,fetch = FetchType.EAGER)
    private Level level;

    @ManyToOne(targetEntity = Division.class,fetch = FetchType.EAGER)
    private Division division;

    @OneToMany (mappedBy = "employee")
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
//        UserServiceImpl userService = new UserServiceImpl();
        Employee employee= (Employee) target;
//        for(User user: userService.findAll()){
//            if(employee.getEmail().equals(user.getUsername())) {
//                errors.rejectValue("email","email.unique");
//            }
//        }
        ValidationUtils.rejectIfEmpty(errors, "salary", "salary.empty");
        if(employee.getSalary().length() < 10) {
            errors.rejectValue("salary","email.unique");
        }

    }
}
