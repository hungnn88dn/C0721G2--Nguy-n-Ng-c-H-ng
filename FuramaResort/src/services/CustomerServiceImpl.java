package services;

import models.Customer;
import models.Employee;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerSerivce {

    public static void displayCustomer(List<Customer> list) {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    public static void addCustomer(List<Customer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng : ");
        int codeCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên khách hàng : ");
        String nameCtm = scanner.nextLine();
        System.out.println("Nhập năm sinh của khách hàng: ");
        int ageCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính của khách hàng : ");
        String genderCtm = scanner.nextLine();
        System.out.println("Nhập chứng minh nhân dân của khách hàng : ");
        int cmdnCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại  của khách hàng: ");
        int phoneCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email của khách hàng: ");
        String emailCtm = scanner.nextLine();
        System.out.println("Nhập kiểu khách hàng : ");
        String typeCtm = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng : ");
        String addressCtm = scanner.nextLine();
        list.add(new Customer(nameCtm, ageCtm, genderCtm, codeCtm, cmdnCtm, phoneCtm, emailCtm, typeCtm, addressCtm));
    }

    public static void editCustomer(List<Customer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần chỉnh sửa thông tin : ");
        int codeCheck = Integer.parseInt(scanner.nextLine());
        for (Customer customer : list) {
            if (customer.getCodeCustomer() == codeCheck) {
                int chooseEdit;
                do {
                    System.out.println("1.Sửa họ tên: ");
                    System.out.println("2.Sửa năm sinh: ");
                    System.out.println("3.Sửa giới tính: ");
                    System.out.println("4.Sửa mã khách hàng: ");
                    System.out.println("5.Sửa chứng minh nhân dân: ");
                    System.out.println("6.Sửa sửa số điện thoại: ");
                    System.out.println("7.Sửa email: ");
                    System.out.println("8.Sửa kiểu khách hàng: ");
                    System.out.println("9.Sửa địa chỉ: ");
                    System.out.println("0.Thoát tính năng ");
                    System.out.println("Nhập lựa chọn của bạn");
                    chooseEdit = Integer.parseInt(scanner.nextLine());
                    if (chooseEdit == 1) {
                        System.out.println("Nhập tên: ");
                        customer.setName(scanner.nextLine());
                    }
                    if (chooseEdit == 2) {
                        System.out.println("Nhập năm sinh :");
                        customer.setAge(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 3) {
                        System.out.println("Nhập giới tính: ");
                        customer.setGender(scanner.nextLine());
                    }
                    if (chooseEdit == 4) {
                        System.out.println("Nhập mã khách hàng: ");
                        customer.setCodeCustomer(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 5) {
                        System.out.println("Nhập chứng minh nhân dân: ");
                        customer.setCmnd(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 6) {
                        System.out.println("Nhập số điện thoại: ");
                        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 7) {
                        System.out.println("Nhập email: ");
                        customer.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 8) {
                        System.out.println("Nhập kiểu khách hàng: ");
                        customer.setCustomerType(scanner.nextLine());
                    }
                    if (chooseEdit == 9) {
                        System.out.println("Nhập địa chỉ: ");
                        customer.setAddress(scanner.nextLine());
                    }
                } while (chooseEdit != 0);
            }
        }
    }
}
