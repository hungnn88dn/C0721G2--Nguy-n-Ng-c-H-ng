package exercise.validateuser.model;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class User implements Validator {


    private String name;

    @Min(18)
    private int age;

    @Pattern(regexp = "0\\d{9}",
            message = "Phone phai 10 so bat dau bang 0 ")
    private String phone;

    @NotBlank
    @Email
    private String email;

    public User() {
    }

    public User(@NotEmpty @Size(min = 5, max = 45) String name, @Min(18) int age,
                @Pattern(regexp =  "0\\d{9}",
            message = "Phone phai 10 so bat dau bang 0") String phone, @NotBlank @Email String email) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user= (User) target;
        if(user.getName().equals("hungnn")){
            errors.reject("name","name.invalidFormat");
        }
    }
}