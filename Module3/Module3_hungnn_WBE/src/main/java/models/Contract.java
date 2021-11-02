package models;

public class Contract extends Booking{
    private int contractNumber;
    private int deposit;
    private int totalPayment;

    public Contract() {

    }

    public Contract(int contractNumber, int deposit, int totalPayment) {
        this.contractNumber = contractNumber;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public Contract(int bookingCode, int customerCode, int contractNumber, int deposit, int totalPayment) {
        super(bookingCode, customerCode);
        this.contractNumber = contractNumber;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }


}
