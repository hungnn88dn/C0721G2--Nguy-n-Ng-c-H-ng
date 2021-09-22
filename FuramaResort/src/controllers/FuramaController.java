package controllers;

import models.Customer;
import models.Employee;
import services.CustomerServiceImpl;
import services.EmployeeService;
import services.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    List<Employee> employeeServiceList = new ArrayList<>();
    List<Customer> customerArrayList = new LinkedList<>();

    public void displayMainMenu() {
        int choose;
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                int chooseEmployee;
                do {
                    System.out.println("1. Display list employees");
                    System.out.println("2. Add new employees");
                    System.out.println("3. Edit list employees");
                    System.out.println("4. Return main menu");
                    System.out.println("Nhập lựa chọc của bạn");
                    chooseEmployee = Integer.parseInt(scanner.nextLine());
                    if (chooseEmployee == 1) {
                        EmployeeServiceImpl.displayEmployee(employeeServiceList);
                    }
                    if (chooseEmployee == 2) {
                        EmployeeServiceImpl.addEmployee(employeeServiceList);
                    }
                    if (chooseEmployee == 3) {
                        EmployeeServiceImpl.editEmployee(employeeServiceList);
                    }

                } while (chooseEmployee != 4);
            }
            if (choose == 2) {
                int chooseCustomer;
                do {
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customers");
                    System.out.println("3. Edit list customers");
                    System.out.println("4. Return main menu");
                    System.out.println("Nhập lựa chọc của bạn");
                    chooseCustomer = Integer.parseInt(scanner.nextLine());
                    if (chooseCustomer == 1) {
                        CustomerServiceImpl.displayCustomer(customerArrayList);
                    }
                    if (chooseCustomer == 2) {
                        CustomerServiceImpl.addCustomer(customerArrayList);
                    }
                    if (chooseCustomer == 3) {
                        CustomerServiceImpl.editCustomer(customerArrayList);
                    }
                } while (chooseCustomer != 4);
            }
            if (choose == 3) {
                int chooseFacility;
                do {
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Edit list facility");
                    System.out.println("4. Return main menu");
                    System.out.println("Nhập lựa chọc của bạn");
                    chooseFacility = Integer.parseInt(scanner.nextLine());
                } while (chooseFacility != 4);
            }
            if (choose == 4) {
                int chooseBooking;
                do {
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display new contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    System.out.println("Nhập lựa chọc của bạn");
                    chooseBooking = Integer.parseInt(scanner.nextLine());
                } while (chooseBooking != 6);
            }
            if (choose == 5) {
                int choosePromotion;
                do {
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers use voucher");
                    System.out.println("3. Return main menu");
                    System.out.println("Nhập lựa chọc của bạn");
                    choosePromotion = Integer.parseInt(scanner.nextLine());
                } while (choosePromotion != 3);
            }
        } while (choose != 6);
    }
}
