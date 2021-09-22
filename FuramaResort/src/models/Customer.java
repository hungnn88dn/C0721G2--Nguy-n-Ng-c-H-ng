package models;

public class Customer extends Person {
    private int codeCustomer;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String customerType;
    private String address;

    public Customer(int codeCustomer, int cmnd, int phoneNumber, String email, String customerType, String address) {
        this.codeCustomer = codeCustomer;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, int age, String gender, int codeCustomer, int cmnd, int phoneNumber, String email, String customerType, String address) {
        super(name, age, gender);
        this.codeCustomer = codeCustomer;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "codeCustomer=" + codeCustomer +
                ", cmnd=" + cmnd +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
