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
        Employee employee1= new Employee("Nguyen Van A",1988,"Nam",1,111,1111,"a@gmail.com","Dai hoc","Bao ve",1000);
        Employee employee2= new Employee("Nguyen Thi B",1989,"Nữ",2,222,2222,"b@gmail.com","Dai hoc","Le Tan",1500);
        Employee employee3= new Employee("Nguyen Van C",1990,"Nam",3,333,3333,"c@gmail.com","Thac si","Truong Phong",3000);
        Employee employee4= new Employee("Nguyen Thi D",1991,"Nữ",4,444,4444,"d@gmail.com","Dai hoc","Ke Toan",2000);
    }

    public static void addEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên : ");
        int codeEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên nhân viên : ");
        String nameEmp = scanner.nextLine();
        System.out.println("Nhập năm sinh của nhân viên: ");
        int ageEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính của nhân viên : ");
        String genderEmp = scanner.nextLine();
        System.out.println("Nhập chứng minh nhân dân của nhân viên : ");
        int cmdnEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại  của nhân viên : ");
        int phoneEmp = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email của nhân viên : ");
        String emailEmp = scanner.nextLine();
        System.out.println("Nhập trình độ của nhân viên : ");
        String levelEmp = scanner.nextLine();
        System.out.println("Nhập vị trí của nhân viên : ");
        String officeEmp = scanner.nextLine();
        System.out.println("Nhập lương của nhân viên : ");
        int salaryEmp = Integer.parseInt(scanner.nextLine());
        list.add(new Employee(nameEmp, ageEmp, genderEmp, codeEmp, cmdnEmp, phoneEmp, emailEmp, levelEmp, officeEmp, salaryEmp));
    }

    public static void editEmployee(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên cần chỉnh sửa thông tin : ");
        int codeCheck = Integer.parseInt(scanner.nextLine());
        for (Employee employee : list) {
            if (employee.getCodeEmployee() == codeCheck) {
                int chooseEdit;

                do {
                    System.out.println(employee);
                    System.out.println("1.Sửa họ tên: ");
                    System.out.println("2.Sửa năm sinh: ");
                    System.out.println("3.Sửa giới tính: ");
                    System.out.println("4.Sửa mã nhân viên: ");
                    System.out.println("5.Sửa chứng minh nhân dân: ");
                    System.out.println("6.Sửa sửa số điện thoại: ");
                    System.out.println("7.Sửa email: ");
                    System.out.println("8.Sửa trình độ: ");
                    System.out.println("9.Sửa vị trí: ");
                    System.out.println("10.Sửa mức lương: ");
                    System.out.println("0.Thoát tính năng ");
                    System.out.println("Nhập lựa chọn của bạn");
                    chooseEdit = Integer.parseInt(scanner.nextLine());
                    if (chooseEdit == 1) {
                        System.out.println("Nhập tên: ");
                        employee.setName(scanner.nextLine());
                    }
                    if (chooseEdit == 2) {
                        System.out.println("Nhập năm sinh :");
                        employee.setAge(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 3) {
                        System.out.println("Nhập giới tính: ");
                        employee.setGender(scanner.nextLine());
                    }
                    if (chooseEdit == 4) {
                        System.out.println("Nhập mã nhân viên: ");
                        employee.setCodeEmployee(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 5) {
                        System.out.println("Nhập chứng minh nhân dân: ");
                        employee.setCmnd(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 6) {
                        System.out.println("Nhập số điện thoại: ");
                        employee.setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                    }
                    if (chooseEdit == 7) {
                        System.out.println("Nhập email: ");
                        employee.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 8) {
                        System.out.println("Nhập trình độ: ");
                        employee.setEmail(scanner.nextLine());
                    }
                    if (chooseEdit == 9) {
                        System.out.println("Nhập vị trí: ");
                        employee.setOffice(scanner.nextLine());
                    }
                    if (chooseEdit == 10) {
                        System.out.println("Nhập mức lương: ");
                        employee.setSalary(Integer.parseInt(scanner.nextLine()));
                    }
                } while (chooseEdit != 0);
            }
        }
    }
}
