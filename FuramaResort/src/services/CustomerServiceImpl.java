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
    static {
        Customer customer1= new Customer("Nguyen Van E",1988,"Male",5,555,5555,"e@gmail.com","Diamond","HN");
        Customer customer2= new Customer("Nguyen Thi F",1989,"Female",6,666,6666,"f@gmail.com","Platinium","HCM");
        Customer customer3= new Customer("Nguyen Van G",1990,"Male",7,777,777,"g@gmail.com","Gold","QN");
        Customer customer4= new Customer("Nguyen Thi H",1991,"Female",8,888,8888,"h@gmail.com","Silver","QT");
        Customer customer5= new Customer("Nguyen Thi K",1992,"Female",9,999,9999,"k@gmail.com","Member","Hue");
    }

    public static void addCustomer(List<Customer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input codeCustomer : ");
        int codeCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("input Name : ");
        String nameCtm = scanner.nextLine();
        System.out.println("input Age: ");
        int ageCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("input Gender : ");
        String genderCtm = scanner.nextLine();
        System.out.println("input CMND : ");
        int cmdnCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("input PhoneNumber: ");
        int phoneCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("input Email: ");
        String emailCtm = scanner.nextLine();
        System.out.println("input customerType: ");
        String typeCtm = scanner.nextLine();
        System.out.println("input Address: ");
        String addressCtm = scanner.nextLine();
        list.add(new Customer(nameCtm, ageCtm, genderCtm, codeCtm, cmdnCtm, phoneCtm, emailCtm, typeCtm, addressCtm));
    }

    public static void editCustomer(List<Customer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input codeCustomer you need to edit: ");
        int codeCheck = Integer.parseInt(scanner.nextLine());
        for (Customer customer : list) {
            if (customer.getCodeCustomer() == codeCheck) {
                int chooseEdit;
                do {
                    System.out.println(customer);
                    System.out.println("1.Edit Name: ");
                    System.out.println("2.Edit Age: ");
                    System.out.println("3.Edit Gender: ");
                    System.out.println("4.Edit Customer's Code: ");
                    System.out.println("5.Edit CMND: ");
                    System.out.println("6.Edit Phone Number: ");
                    System.out.println("7.Edit Email: ");
                    System.out.println("8.Edit customerType: ");
                    System.out.println("9.Edit Address: ");
                    System.out.println("0.Exit ");
                    System.out.println("Your choose: ");
                    chooseEdit = Integer.parseInt(scanner.nextLine());
                    if (chooseEdit == 1) {
                        System.out.println("input Name: ");
                        customer.setName(scanner.nextLine());
                    }
                    if (chooseEdit == 2) {
                        System.out.println("input Age :");
                        customer.setAge(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 3) {
                        System.out.println("input Gender: ");
                        customer.setGender(scanner.nextLine());
                    }
                    if (chooseEdit == 4) {
                        System.out.println("input customerCode: ");
                        customer.setCodeCustomer(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 5) {
                        System.out.println("input CMND: ");
                        customer.setCmnd(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 6) {
                        System.out.println("input PhoneNumber: ");
                        customer.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 7) {
                        System.out.println("input Email: ");
                        customer.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 8) {
                        System.out.println("input customerType: ");
                        customer.setCustomerType(scanner.nextLine());
                    }
                    if (chooseEdit == 9) {
                        System.out.println("input Address: ");
                        customer.setAddress(scanner.nextLine());
                    }
                } while (chooseEdit != 0);
            }
        }
    }
}
