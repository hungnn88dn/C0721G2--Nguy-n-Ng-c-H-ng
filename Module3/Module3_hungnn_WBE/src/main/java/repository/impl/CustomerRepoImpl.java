package repository.impl;

import models.*;
import repository.CustomerSerivceRepo;

import java.io.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepoImpl implements CustomerSerivceRepo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama?SSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_CUSTOMER_SQL = "insert into customer (`name`,age,gender,cmnd,phone,email,address,type_customer_id) " +
            " value " +
            " ( ?,?,?,?,?,?,?,?);";
    private static final String SELECT_CUSTOMER_BY_ID = "select `name`,age,cmnd,salary,phone,email,address," +
            " position_id,level_id,department_id,user_username from employee where id =?";
    private static final String SELECT_ALL_CUSTOMER = "select * from customer";
    private static final String DELETE_CUSTOMERSQL = "delete from employee where id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "update employee set name = ?,age= ?, cmnd = ?,salary =?, phone= ?," +
            " email =? ,address = ?,position_id = ? level_id = ?,department_id =?,user_username=?  where id = ?;";
    private static final String SELECT_ALL_TYPE_CUSTOMER = "select * from type_customer";


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

    public List<TypeCustomer> selectAllTypeCustomer() {
        List<TypeCustomer> typeCustomers = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE_CUSTOMER);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                typeCustomers.add(new TypeCustomer(id, name));
            }
        } catch (SQLException ignored) {
        }
        return typeCustomers;
    }


    @Override
    public void insertCustomer(Customer customer)  {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getAge());
            preparedStatement.setString(3, String.valueOf(customer.getGender()));
            preparedStatement.setString(4, String.valueOf(customer.getCmnd()));
            preparedStatement.setString(5, String.valueOf(customer.getPhoneNumber()));
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setString(8, customer.getCustomerType());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new LinkedList<>();
        List<TypeCustomer> typeCustomers = selectAllTypeCustomer();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                int cmnd = Integer.parseInt(rs.getString("cmnd"));
                int phone = Integer.parseInt(rs.getString("phone"));
                String email = rs.getString("email");
                String address = rs.getString("address");
                String type_customer_id = rs.getString("type_customer_id");
                String type_customer = "";
                for (TypeCustomer t : typeCustomers) {
                    if (t.getId() == Integer.parseInt(type_customer_id)) {
                        type_customer = t.getName();
                    }
                }
                customers.add(new Customer(name, age, gender, id, cmnd, phone, email, address, type_customer));
            }
        } catch (SQLException ignored) {
        }
        return customers;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return false;
    }
}
