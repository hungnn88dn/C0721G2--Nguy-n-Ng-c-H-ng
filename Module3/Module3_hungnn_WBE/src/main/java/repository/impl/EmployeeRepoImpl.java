package repository.impl;

import models.Employee;
import repository.EmployeeServiceRepo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepoImpl implements EmployeeServiceRepo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama?employeeSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

    }
}
