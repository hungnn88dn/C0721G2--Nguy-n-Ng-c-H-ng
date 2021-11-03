package repository.impl;

import models.Department;
import models.Employee;
import models.Level;
import models.Position;
import repository.EmployeeServiceRepo;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepoImpl implements EmployeeServiceRepo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama?SSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_EMPLOYEE_SQL = "insert into employee (`name`,age,cmnd,salary,phone,email,address,position_id,level_id,department_id,user_username) " +
            "value" +
            " ( ?,?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_EMPLOYEE_BY_ID = "select `name`,age,cmnd,salary,phone,email,address," +
            " position_id,level_id,department_id,user_username from employee where id =?";
    private static final String SELECT_ALL_EMPLOYEE = "select * from employee";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where id = ?;";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set name = ?,age= ?, cmnd = ?,salary =?, phone= ?," +
            " email =? ,address = ?,position_id = ? level_id = ?,department_id =?,user_username=?  where id = ?;";
    private static final String SELECT_ALL_LEVEL = "select * from `level`";
    private static final String SELECT_ALL_POSITION = "select * from `position`";
    private static final String SELECT_ALL_DEPARTMENT = "select * from `department`";


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

    public List<Level> selectAllLevel() {
        List<Level> levels = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_LEVEL);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("level");
                levels.add(new Level(id, name));
            }
        } catch (SQLException ignored) {
        }
        return levels;
    }

    public List<Position> selectAllPosition() {

        List<Position> positions = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                positions.add(new Position(id, name));
            }
        } catch (SQLException ignored) {
        }
        return positions;
    }

    public List<Department> selectAllDepartment() {
        List<Department> departments = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DEPARTMENT);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                departments.add(new Department(id, name));
            }
        } catch (SQLException ignored) {
        }
        return departments;
    }

     @Override
    public List<Employee> selectAllEmployees() {
        List<Employee> employees = new LinkedList<>();
        List<Level> levels = selectAllLevel();
        List<Position> positions = selectAllPosition();
        List<Department> departments = selectAllDepartment();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                int cmnd = Integer.parseInt(rs.getString("cmnd"));
                int salary = Integer.parseInt(rs.getString("salary"));
                int phone = Integer.parseInt(rs.getString("phone"));
                String email = rs.getString("email");
                String address = rs.getString("address");
                String position_id = rs.getString("position_id");
                String position = "";
                for (Position p : positions) {
                    if (p.getId() == Integer.parseInt(position_id)) {
                        position = p.getName();
                    }
                }
                String level_id = rs.getString("level_id");
                String level = "";
                for (Level l : levels) {
                    if (l.getId() == Integer.parseInt(level_id)) {
                        level = l.getLevel();
                    }
                }
                String department_id = rs.getString("department_id");
                String department = "";
                for (Department d : departments) {
                    if (d.getId() == Integer.parseInt(department_id)) {
                        department = d.getName();
                    }
                }
                String user_username = rs.getString("user_username");
                employees.add(new Employee(name, age, id, cmnd, phone, email, address, level, position, department, salary, user_username));
            }
        } catch (SQLException ignored) {
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return false;
    }

    @Override
    public void insertUser(Employee employee) {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getAge());
            preparedStatement.setString(3, String.valueOf(employee.getCmnd()));
            preparedStatement.setString(4, String.valueOf(employee.getSalary()));
            preparedStatement.setString(5, String.valueOf(employee.getPhoneNumber()));
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setString(8, employee.getOffice());
            preparedStatement.setString(9, employee.getLevel());
            preparedStatement.setString(10, employee.getDepartment());
            preparedStatement.setString(11, employee.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    @Override
    public Employee selectEmployee(int id) {
        return null;
    }

}
