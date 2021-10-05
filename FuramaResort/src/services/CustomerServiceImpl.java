package services;

import models.Customer;
import models.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerSerivce {
    static File file = new File("src\\data\\customer.csv");
    CustomerServiceImpl customerService;

    public static List<Customer> readCustomerCSV() {
        List<Customer> readList = new LinkedList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                Customer customer = new Customer(lineSplit[0], lineSplit[1], lineSplit[2], Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]), Integer.parseInt(lineSplit[5]), lineSplit[6], lineSplit[7], lineSplit[8]);
                readList.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readList;
    }

    public static void writerCustomerCSV(List<Customer> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : list) {
                bufferedWriter.write(String.valueOf(customer));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkMember() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        Scanner scanner= new Scanner(System.in);
        int choose;
        do {
            System.out.println("1.You are Member");
            System.out.println("2.You are new Customer ? Press 2 to sign up");
            System.out.println("0.Back to Menu");
            System.out.println("Your chosse: ");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                int count = 0;
                System.out.println("Input Member Code: ");
                int customerCode = Integer.parseInt(scanner.nextLine());
                List<Customer>  list= CustomerServiceImpl.readCustomerCSV();
                for (Customer customer:  list) {
                    if (customer.getCodeCustomer() == customerCode) {
                        System.out.println(customer.showCustomer());
                        break;
                    }else {
                        count++;
                    }
                }
                if (count == list.size()) {
                    System.out.println("You are not member, please sign up");
                    customerService.add();
                    choose = 0;
                }
             choose =0;
            }
            if (choose == 2) {
                customerService.add();
                choose = 0;
            }
        } while(choose != 0);
    }

    @Override
    public void display() {
        List<Customer> list = CustomerServiceImpl.readCustomerCSV();
        for (Customer customer : list) {
            System.out.println(customer.showCustomer());
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input codeCustomer : ");
        int codeCtm = Integer.parseInt(scanner.nextLine());
        System.out.println("input Name : ");
        String nameCtm = scanner.nextLine();
        System.out.println("input Age: ");
        String ageCtm = scanner.nextLine();
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
        List<Customer> list = new LinkedList<>();
        list = CustomerServiceImpl.readCustomerCSV();
        list.add(new Customer(nameCtm, ageCtm, genderCtm, codeCtm, cmdnCtm, phoneCtm, emailCtm, typeCtm, addressCtm));
        CustomerServiceImpl.writerCustomerCSV(list);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input codeCustomer you need to edit: ");
        List<Customer> customerList = new LinkedList<>();
        int codeCheck = Integer.parseInt(scanner.nextLine());
        customerList = CustomerServiceImpl.readCustomerCSV();
        for (Customer customer : customerList) {
            if (customer.getCodeCustomer() == codeCheck) {
                int chooseEdit;
                do {
                    System.out.println(customer.showCustomer());
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
                        customer.setAge(scanner.nextLine());
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
                    CustomerServiceImpl.writerCustomerCSV(customerList);
                } while (chooseEdit != 0);
            }
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

    }
}
