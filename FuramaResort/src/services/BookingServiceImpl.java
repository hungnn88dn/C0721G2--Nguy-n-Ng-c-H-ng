package services;

import models.Booking;
import models.Customer;
import utils.BookingComparator;

import java.io.*;
import java.util.Collections;
import java.util.*;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    static File file = new File("src\\data\\booking.csv");
    static Scanner scanner = new Scanner(System.in);


    static Set<Booking> readBooking() {
        Set<Booking> bookingList = new HashSet<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                bookingList.add(new Booking(Integer.parseInt(lineSplit[0]), lineSplit[1],
                        lineSplit[2], Integer.parseInt(lineSplit[3]), lineSplit[4], lineSplit[5]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }

    static void writerBooking(Set<Booking> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Booking booking : list) {
                bufferedWriter.write(String.valueOf(booking));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void display() {
        Set<Booking> list = BookingServiceImpl.readBooking();
        List<Booking> newList = new LinkedList<>(list);
        Collections.sort(newList,new BookingComparator());
        for (Booking booking : newList) {
            System.out.println(booking.showBooking());
        }
    }

    @Override
    public void add() {
        Set<Booking> listBookings= BookingServiceImpl.readBooking();
        CustomerServiceImpl.checkMember();
        System.out.println("input bookingCode");
        int bookingCode = Integer.parseInt(scanner.nextLine());
        System.out.println("input startDay");
        String startDay = scanner.nextLine();
        System.out.println("input endDay");
        String endDay = scanner.nextLine();
        System.out.println("input customerCode");
        int customerCode = Integer.parseInt(scanner.nextLine());
        System.out.println("input sericeName");
        String serviceName = scanner.nextLine();
        System.out.println("input serviceType");
        String serviceType = scanner.nextLine();
        listBookings.add(new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceType));
        BookingServiceImpl.writerBooking(listBookings);
    }

    public static void main(String[] args) {
        BookingServiceImpl bookingService= new BookingServiceImpl();
        bookingService.add();
    }
    @Override
    public void edit() {
//         update later
    }

    @Override
    public void search() {
//         update later
    }

    @Override
    public void delete() {
//         update later
    }
}
            