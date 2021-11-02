package repository.impl;

import models.Booking;
import models.Contract;
import repository.ContractServiceRepo;
import utils.BookingComparator;

import java.io.*;
import java.util.*;

public class ContactRepoImpl implements ContractServiceRepo {
    static File file = new File("src\\data\\contract.csv");
    static Scanner scanner = new Scanner(System.in);

    public static Queue<Contract> readContract() {
        Queue<Contract> contractLinkedList = new LinkedList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                Contract contract = new Contract(Integer.parseInt(lineSplit[0]), Integer.parseInt(lineSplit[1])
                        , Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]));
                contractLinkedList.add(contract);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractLinkedList;
    }

    public static void writerContract(Queue<Contract> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Contract contract : list) {
                bufferedWriter.write(String.valueOf(contract));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkBooking() {
        Set<Booking> bookingList = BookingRepoImpl.readBooking();
        LinkedList<Booking> bookingNewList = new LinkedList<>(bookingList);
        Collections.sort(bookingNewList, new BookingComparator());
        for (Booking booking : bookingNewList) {
            if (booking.getServiceType().compareTo("Room") != 0) {
                System.out.println(booking.showBooking());
            }
        }
    }

    public static void main(String[] args) {
        ContactRepoImpl contactService = new ContactRepoImpl();
        contactService.add();
    }

    @Override
    public void display() {
        Queue<Contract> contractLinkedList = ContactRepoImpl.readContract();
        for (Contract contract : contractLinkedList) {
            System.out.println(contract.showContract());
        }
    }

    @Override
    public void add() {
        ContactRepoImpl.checkBooking();
        System.out.println("input Booking Code");
        int bookingCode = Integer.parseInt(scanner.nextLine());
        System.out.println("input Customer Code");
        int customerCode = Integer.parseInt(scanner.nextLine());
        System.out.println("input contractNumber");
        int contractNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("input deposit");
        int deposit = Integer.parseInt(scanner.nextLine());
        System.out.println("input totalPayment");
        int totalPayment = Integer.parseInt(scanner.nextLine());
        Queue<Contract> contractLinkedList = new LinkedList<>();
        contractLinkedList.add(new Contract(bookingCode, customerCode, contractNumber, deposit, totalPayment));
        ContactRepoImpl.writerContract(contractLinkedList);
    }

    @Override
    public void edit() {
        System.out.println("input contractNumber you need to edit ");
        int contractNumber = Integer.parseInt(scanner.nextLine());
        Queue<Contract> contractLinkedList = ContactRepoImpl.readContract();
        int choose;
        for (Contract contract : contractLinkedList) {
            if (contract.getContractNumber() == contractNumber) {
                do {
                    System.out.println(contract.showContract());
                    System.out.println("1. Edit bookingCode");
                    System.out.println("2. Edit customerCode");
                    System.out.println("3. Edit contractNumber");
                    System.out.println("4. Edit deposit");
                    System.out.println("5. Edit totalPayment");
                    System.out.println("0. Back to Menu");
                    System.out.println("Your chosse: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        System.out.println("input bookingCode");
                        contract.setBookingCode(Integer.parseInt(scanner.nextLine()));
                    }
                    if (choose == 2) {
                        System.out.println("input customerCode");
                        contract.setCustomerCode(Integer.parseInt(scanner.nextLine()));
                    }
                    if (choose == 3) {
                        System.out.println("input contractNumber");
                        contract.setContractNumber(Integer.parseInt(scanner.nextLine()));
                    }
                    if (choose == 4) {
                        System.out.println("input deposit");
                        contract.setDeposit(Integer.parseInt(scanner.nextLine()));
                    }
                    if (choose == 5) {
                        System.out.println("input totalPayment");
                        contract.setTotalPayment(Integer.parseInt(scanner.nextLine()));
                    }
                } while (choose != 0);
            }
        }
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
