package models;

public class Customer extends Person {
    private int codeCustomer;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String address;
    private String customerType;

    public Customer(int codeCustomer, int cmnd, int phoneNumber, String email, String customerType, String address) {
        this.codeCustomer = codeCustomer;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String age, String gender, int codeCustomer, int cmnd, int phoneNumber, String email, String address, String customerType) {
        super(name, age, gender);
        this.codeCustomer = codeCustomer;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public Customer(String name, String age, String gender, int cmnd, int phoneNumber, String email, String address, String customerType) {
        super(name, age, gender);
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
