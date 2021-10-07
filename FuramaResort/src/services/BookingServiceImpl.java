package services;

import models.Booking;
import models.Customer;
import models.Facility;
import utils.BookingComparator;

import java.io.*;
import java.util.Collections;
import java.util.*;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    static File file = new File("src\\data\\booking.csv");
    static Scanner scanner = new Scanner(System.in);
    FacilityServiceImpl facilityService = new FacilityServiceImpl();


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
        Collections.sort(newList, new BookingComparator());
        for (Booking booking : newList) {
            System.out.println(booking.showBooking());
        }
    }

    @Override
    public void add() {
        Set<Booking> listBookings = BookingServiceImpl.readBooking();
        int customerCode = CustomerServiceImpl.checkMember();
        List<Booking> list = new ArrayList<>(listBookings);
        int bookingCode = list.get(list.size() - 1).getBookingCode() + 1;
        System.out.println("input startDay");
        String startDay = scanner.nextLine();
        System.out.println("input endDay");
        String endDay = scanner.nextLine();
        facilityService.display();
        System.out.println("input seviceName");
        String serviceName = scanner.nextLine();
        System.out.println("choose serviceID");
        String serviceType = scanner.nextLine();
        listBookings.add(new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceType));
        BookingServiceImpl.writerBooking(listBookings);
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
            