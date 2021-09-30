package services;

import models.Booking;

import java.util.*;
import java.util.TreeSet;
public class BookingServiceImpl implements BookingService {
    static Scanner scanner= new Scanner(System.in);
  static   TreeSet<Booking> bookingList= new TreeSet<Booking>();
    public static void main(String[] args) {

       BookingServiceImpl.displayBooking(bookingList);
    }
    static {
        bookingList.add(new Booking(1,"29/9/2021","2/10/2021",11,"Villa","Vip"));
        bookingList.add(new Booking(2,"29/9/2021","3/10/2021",22,"House","Vip"));
        bookingList.add(new Booking(3,"29/9/2021","30/9/2021",33,"Room","Vip"));
        bookingList.add(new Booking(4,"27/9/2021","30/9/2021",44,"Room","Vip"));
        bookingList.add(new Booking(5,"29/9/2021","1/10/2021",55,"Room","Vip"));
    }

    public static void addBooking(TreeSet<Booking> bookingList) {
        System.out.println("input bookingCode");
        int bookingCode= Integer.parseInt(scanner.nextLine());
        System.out.println("input startDay");
        String startDay= scanner.nextLine();
        System.out.println("input endDay");
        String endDay= scanner.nextLine();
        System.out.println("input customerCode");
        int customerCode= Integer.parseInt(scanner.nextLine());
        System.out.println("input serviceName");
        String serviceName= scanner.nextLine();
        System.out.println("input serviceType");
        String serviceType= scanner.nextLine();
        bookingList.add(new Booking(bookingCode,startDay,endDay,customerCode,serviceName,serviceType));
    }

    public static void displayBooking (TreeSet<Booking> bookingList) {
        for(Booking booking: bookingList) {
            System.out.println(booking);
        }
    }
}
            