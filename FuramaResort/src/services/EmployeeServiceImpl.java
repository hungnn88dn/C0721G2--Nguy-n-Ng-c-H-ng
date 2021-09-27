package services;

import models.Customer;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList= new ArrayList<>();
    public static void displayEmployee(List<Employee> list) {
        for (Employee Employee : list) {
            System.out.println(Employee);
        }
    }
    static {
        Employee employee1= new Employee("Nguyen Van A",1988,"Male",1,111,1111,"a@gmail.com","12/12","Protector",1000);
        Employee employee2= new Employee("Nguyen Thi B",1989,"Female",2,222,2222,"b@gmail.com","University","Receptionist",1500);
        Employee employee3= new Employee("Nguyen Van C",1990,"Male",3,333,3333,"c@gmail.com","Master","Manager",3000);
        Employee employee4= new Employee("Nguyen Thi D",1991,"Female",4,444,4444,"d@gmail.com","University","Accountant",2000);
    }

    public static void addEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input codeEmployee : ");
        int codeEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("input Name: ");
        String nameEmp = scanner.nextLine();
        System.out.println("input Age: ");
        int ageEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("input Gender: ");
        String genderEmp = scanner.nextLine();
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
        list.add(new Employee(nameEmp, ageEmp, genderEmp, codeEmp, cmdnEmp, phoneEmp, emailEmp, levelEmp, officeEmp, salaryEmp));
    }

    public static void editEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Employee'code you need to edit : ");
        int codeCheck = Integer.parseInt(scanner.nextLine());
        for (Employee employee : list) {
            if (employee.getCodeEmployee() == codeCheck) {
                int chooseEdit;

                do {
                    System.out.println(employee);
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
                        employee.setAge(Integer.parseInt(scanner.nextLine()));
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
                } while (chooseEdit != 0);
            }
        }
    }
}
