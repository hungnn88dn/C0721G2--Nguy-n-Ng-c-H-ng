package models;

public class Employee extends Person{
    private int codeEmployee;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String level;
    private String office;
    private double salary;

    public Employee(int codeEmployee, Integer cmnd, int phoneNumber, String email, String level, String office, double salary) {
        this.codeEmployee = codeEmployee;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String age, String gender, int codeEmployee, Integer cmnd, int phoneNumber, String email, String level, String office, double salary) {
        super(name, age, gender);
        this.codeEmployee = codeEmployee;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.office = office;
        this.salary = salary;
    }

    public int getCodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }

    public Integer getCmnd() {
        return cmnd;
    }

    public void setCmnd(Integer cmnd) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "codeEmployee=" + codeEmployee +
                ",cmnd=" + cmnd +
                ",phoneNumber=" + phoneNumber +
                ",email='" + email + '\'' +
                ",level='" + level + '\'' +
                ",office='" + office + '\'' +
                ",salary=" + salary +
                "} " + super.getName() ;
    }


}
