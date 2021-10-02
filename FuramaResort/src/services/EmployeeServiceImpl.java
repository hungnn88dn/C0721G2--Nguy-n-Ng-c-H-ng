package services;

import models.Customer;
import models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static File file = new File("src\\data\\employee.csv");

    public static List<Employee> readEmployee() {
        List<Employee> listEmp = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                Employee employee = new Employee(lineSplit[0], lineSplit[1], lineSplit[2], Integer.parseInt(lineSplit[3]), Integer.parseInt(lineSplit[4]), Integer.parseInt(lineSplit[5]), lineSplit[6], lineSplit[7], lineSplit[8], Integer.parseInt(lineSplit[9]));
                listEmp.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listEmp;
    }

    public static void writerEmployee(List<Employee> list) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee employee : list) {
                bufferedWriter.write(String.valueOf(employee));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void displayEmployee(List<Employee> list) {
        list = EmployeeServiceImpl.readEmployee();
        for (Employee Employee : list) {
            System.out.println(Employee.showEmployee());
        }
    }

    public static void addEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Name: ");
        String nameEmp = scanner.nextLine();
        System.out.println("input Age: ");
        String ageEmp = scanner.nextLine();
        System.out.println("input Gender: ");
        String genderEmp = scanner.nextLine();
        System.out.println("input codeEmployee : ");
        int codeEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("input CMND : ");
        int cmdnEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("input Phone Number : ");
        int phoneEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("input Email : ");
        String emailEmp = scanner.nextLine();
        System.out.println("input Level : ");
        String levelEmp = scanner.nextLine();
        System.out.println("input Office : ");
        String officeEmp = scanner.nextLine();
        System.out.println("input salary: ");
        int salaryEmp = Integer.parseInt(scanner.nextLine());
        list = EmployeeServiceImpl.readEmployee();
        list.add(new Employee(nameEmp, ageEmp, genderEmp, codeEmp, cmdnEmp, phoneEmp, emailEmp, levelEmp, officeEmp, salaryEmp));
        EmployeeServiceImpl.writerEmployee(list);
    }

    public static void editEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Employee'code you need to edit : ");
        int codeCheck = Integer.parseInt(scanner.nextLine());
        list = EmployeeServiceImpl.readEmployee();
        for (Employee employee : list) {
            if (employee.getCodeEmployee() == codeCheck) {
                int chooseEdit;
                do {
                    System.out.println(employee.showEmployee());
                    System.out.println("1.Edit Name: ");
                    System.out.println("2.Edit Age: ");
                    System.out.println("3.Edit Gender: ");
                    System.out.println("4.Edit Employee's code: ");
                    System.out.println("5.Edit CMND: ");
                    System.out.println("6.Edit Phone Number: ");
                    System.out.println("7.Edit Email: ");
                    System.out.println("8.Edit Level: ");
                    System.out.println("9.Edit Office: ");
                    System.out.println("10.Edit Salary: ");
                    System.out.println("0.Exit. ");
                    System.out.println("Your choose: ");
                    chooseEdit = Integer.parseInt(scanner.nextLine());
                    if (chooseEdit == 1) {
                        System.out.println("input Name: ");
                        employee.setName(scanner.nextLine());
                    }
                    if (chooseEdit == 2) {
                        System.out.println("input Age :");
                        employee.setAge(scanner.nextLine());
                    }
                    if (chooseEdit == 3) {
                        System.out.println("input Gender: ");
                        employee.setGender(scanner.nextLine());
                    }
                    if (chooseEdit == 4) {
                        System.out.println("input codeEmployer: ");
                        employee.setCodeEmployee(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 5) {
                        System.out.println("input CMND: ");
                        employee.setCmnd(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 6) {
                        System.out.println("input PhoneNumber: ");
                        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 7) {
                        System.out.println("input Email: ");
                        employee.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 8) {
                        System.out.println("input Level: ");
                        employee.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 9) {
                        System.out.println("input Office: ");
                        employee.setOffice(scanner.nextLine());
                    }
                    if (chooseEdit == 10) {
                        System.out.println("input Salary: ");
                        employee.setSalary(Integer.parseInt(scanner.nextLine()));
                    }
                    EmployeeServiceImpl.writerEmployee(list);
                } while (chooseEdit != 0);
            }
        }
    }
}
