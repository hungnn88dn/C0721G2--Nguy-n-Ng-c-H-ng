package models;

import java.util.Date;

public class Booking implements Comparable<Booking>{
    private int bookingCode;
    private String startDay;
    private String endDay;
    private int customerCode;
    private String serviceName;
    private String serviceType;

    Booking() {

    }

    public Booking(int bookingCode, String startDay, String endDay, int customerCode, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public Booking(int bookingCode, int customerCode) {
        this.bookingCode = bookingCode;
        this.customerCode = customerCode;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", customerCode=" + customerCode +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        if (o.getStartDay().compareTo(this.getStartDay()) ==0 ) {
            return o.getEndDay().compareTo(this.getEndDay());
        }else {
            return o.getStartDay().compareTo(this.getStartDay());
        }
    }
}
