package repository.impl;
import models.*;
import repository.ContractServiceRepo;
import service.CustomerSerivce;
import service.EmployeeService;
import service.FacilityService;
import service.Service;
import service.impl.CustomerServiceImpl;
import service.impl.EmployeeServiceImpl;
import service.impl.FacilityServiceImpl;

import java.sql.*;
import java.util.*;

public class ContactRepoImpl implements ContractServiceRepo {

    private String jdbcURL = "jdbc:mysql://localhost:3306/furama?SSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_CONTRACT_SQL = "insert into contract(contract_day,end_day,deposit,total_price,employee_id,customer_id,service_id)\n" +
            " value (?,?,?,?,?,?,?);";
    private static final String SELECT_CONTRACT_BY_ID = "select `name`,age,cmnd,salary,phone,email,address," +
            " position_id,level_id,department_id,user_username from employee where id =?";
    private static final String SELECT_ALL_CONTRACT = "select * from contract";
    private static final String DELETE_CONTRACT_SQL = "delete from employee where id = ?;";
    private static final String UPDATE_CONTRACT_SQL = "update employee set name = ?,age= ?, cmnd = ?,salary =?, phone= ?," +
            " email =? ,address = ?,position_id = ? level_id = ?,department_id =?,user_username=?  where id = ?;";


    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void insertContract(Contract contract) throws SQLException {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT_SQL)) {
            preparedStatement.setString(1, contract.getContractStartDay());
            preparedStatement.setString(2, contract.getContractEndDay());
            preparedStatement.setString(3, String.valueOf(contract.getDeposit()));
            preparedStatement.setString(4, String.valueOf(contract.getTotalPrice()));
            preparedStatement.setString(5, String.valueOf(contract.getEmployeeName()));
            preparedStatement.setString(6, contract.getCustomerName());
            preparedStatement.setString(7, contract.getSerivceName());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    @Override
    public Contract selectContract(int id) {
        return null;
    }

    @Override
    public List<Contract> selectAllContract() {
        List<Contract> contractList = new LinkedList<>();
        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employeeList = employeeService.selectAllEmployees();
        CustomerSerivce customerSerivce = new CustomerServiceImpl();
        List<Customer> customerList = customerSerivce.selectAllCustomer();
        FacilityService facilityService = new FacilityServiceImpl();
        List<Facility> facilityList = facilityService.selectAllFacility();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String startDay = rs.getString("contract_day");
                String endDay = rs.getString("end_day");
                int deposit = Integer.parseInt(rs.getString("deposit"));
                int totalPrice = Integer.parseInt(rs.getString("total_price"));
                String employeeID = rs.getString("employee_id");
                String employeeName = "";
                for (Employee e : employeeList) {
                    if (e.getCodeEmployee() == Integer.parseInt(employeeID)) {
                        employeeName= e.getName();
                    }
                }
                String customerID = rs.getString("customer_id");
                String customerName = "";
                for (Customer c : customerList) {
                    if (c.getCodeCustomer() == Integer.parseInt(customerID)) {
                        customerName= c.getName();
                    }
                }
                String serviceID = rs.getString("service_id");
                String serviceName = "";
                for (Facility f : facilityList) {
                    if (f.getServiceID()== Integer.parseInt(serviceID)) {
                        serviceName= f.getServiceName();
                    }
                }
                contractList.add(new Contract(id, startDay, endDay, deposit, totalPrice, employeeName, customerName, serviceName));
            }
        } catch (SQLException ignored) {
        }
        return contractList;
    }

    @Override
    public boolean deleteContract(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateContract(Contract contract) throws SQLException {
        return false;
    }
}
