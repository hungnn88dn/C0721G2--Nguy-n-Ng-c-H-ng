package models;

public class Employee extends Person{
    private int codeEmployee;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String address;
    private String level;
    private String office;
    private String department;
    private int salary;
    private String username;

    public Employee(String name, String age, int cmnd, int phoneNumber, String email, String address, String level, String office, String department, int salary, String username) {
        super(name, age);
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.level = level;
        this.office = office;
        this.department = department;
        this.salary = salary;
        this.username = username;
    }

    public Employee(String name, String age, int codeEmployee, int cmnd, int phoneNumber, String email, String address,
                    String level, String office, String department, int salary, String username) {
        super(name, age);
        this.codeEmployee = codeEmployee;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.level = level;
        this.office = office;
        this.department = department;
        this.salary = salary;
        this.username = username;
    }

    public int getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
