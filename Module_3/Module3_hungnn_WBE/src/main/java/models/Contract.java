package models;

public class Contract{
    private int contractNumber;
    private String contractStartDay;
    private String contractEndDay;
    private int deposit;
    private int totalPrice;
    private String employeeName;
    private String customerName;
    private String serivceName;

    public Contract(int contractNumber, String contractStartDay, String contractEndDay, int deposit,
                    int totalPrice, String employeeName, String customerName, String serivceName) {
        this.contractNumber = contractNumber;
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.employeeName = employeeName;
        this.customerName = customerName;
        this.serivceName = serivceName;
    }

    public Contract(String contractStartDay, String contractEndDay, int deposit, int totalPrice, String employeeName, String customerName, String serivceName) {
        this.contractStartDay = contractStartDay;
        this.contractEndDay = contractEndDay;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.employeeName = employeeName;
        this.customerName = customerName;
        this.serivceName = serivceName;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractStartDay() {
        return contractStartDay;
    }

    public void setContractStartDay(String contractStartDay) {
        this.contractStartDay = contractStartDay;
    }

    public String getContractEndDay() {
        return contractEndDay;
    }

    public void setContractEndDay(String contractEndDay) {
        this.contractEndDay = contractEndDay;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSerivceName() {
        return serivceName;
    }

    public void setSerivceName(String serivceName) {
        this.serivceName = serivceName;
    }
}
