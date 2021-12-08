package casestudy.furama4.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Customer  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Z]\\w+(\\s[A-Z]\\w+)+",
            message = "Ten sai dinh dang, ex: Nguyen Hung ")
    private String name;
    @NotBlank
    @NotEmpty
    private String age;
    private String gender;
    @Pattern(regexp = "\\d{9}",
            message = "cmnd phai du 9 so")
    private String cmnd;
    @Pattern(regexp = "0\\d{9}",
            message = "Phone phai 10 so bat dau bang 0 ")
    private String phoneNumber;
    @Pattern(regexp = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$",
            message = "Email phai dung dinh dang abc@xyz.com ")
    private String email;
    @NotBlank
    @NotEmpty
    private String address;

    @ManyToOne(targetEntity = TypeCustomer.class)
    private TypeCustomer customerType;

    @OneToMany (mappedBy = "customer")
    private List<Contract> contracts;

    public Customer() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public TypeCustomer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(TypeCustomer customerType) {
        this.customerType = customerType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
