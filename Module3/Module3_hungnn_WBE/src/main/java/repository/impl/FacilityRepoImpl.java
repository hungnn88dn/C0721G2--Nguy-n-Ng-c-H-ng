package repository.impl;


import models.*;
import repository.FacilityServiceRepo;
import utils.Validate;

import java.io.*;
import java.sql.*;
import java.util.*;

public class FacilityRepoImpl implements FacilityServiceRepo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama?SSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Blackberry88";

    private static final String INSERT_FACILITY_SQL = "insert into service( `name`,area,max_people,rental_cost,standard_room,`description`,pool_area,floor,type_rental_id,type_service_id)\n" +
            "value (?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_FACILITY_BY_ID = "select `name`,age,cmnd,salary,phone,email,address," +
            " position_id,level_id,department_id,user_username from employee where id =?";
    private static final String SELECT_ALL_FACILITY = "select * from service";
    private static final String DELETE_FACILITY_SQL = "delete from employee where id = ?;";
    private static final String UPDATE_FACILITY_SQL = "update employee set name = ?,age= ?, cmnd = ?,salary =?, phone= ?," +
            " email =? ,address = ?,position_id = ? level_id = ?,department_id =?,user_username=?  where id = ?;";
    private static final String SELECT_ALL_TYPE_RENTAL = "select * from type_rental";
    private static final String SELECT_ALL_TYPE_SERVICE = "select * from type_service";



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

    public List<RentalType> selectAllRentalType() {
        List<RentalType> rentalTypes = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE_RENTAL);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                int price = Integer.parseInt(rs.getString("price"));
                rentalTypes.add(new RentalType(id, name,price));
            }
        } catch (SQLException ignored) {
        }
        return rentalTypes;
    }

    public List<ServiceType> selectAllServiceType() {
        List<ServiceType> serviceTypes = new LinkedList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE_SERVICE);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String name = rs.getString("name");
                serviceTypes.add(new ServiceType(id, name));
            }
        } catch (SQLException ignored) {
        }
        return serviceTypes;
    }

    @Override
    public void insertFacility(Facility facility) throws SQLException {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FACILITY_SQL)) {
            preparedStatement.setString(1, facility.getServiceName());
            preparedStatement.setString(2, String.valueOf(facility.getAreaUsable()));
            preparedStatement.setString(3, String.valueOf(facility.getMaxPeople()));
            preparedStatement.setString(4, String.valueOf(facility.getRentalCost()));
            preparedStatement.setString(5, String.valueOf(facility.getStandardRoom()));
            preparedStatement.setString(6, facility.getDescription());
            preparedStatement.setString(7, String.valueOf(facility.getPoolArea()));
            preparedStatement.setString(8, String.valueOf(facility.getFloor()));
            preparedStatement.setString(9, facility.getTypeRental());
            preparedStatement.setString(10, facility.getTypeService());
            preparedStatement.executeUpdate();
        } catch (SQLException ignored) {
        }
    }

    @Override
    public Facility selectFacility(int id) {
        return null;
    }

    @Override
    public List<Facility> selectAllFacility() {
        List<Facility> facilities = new LinkedList<>();
        List<RentalType> rentalTypes = selectAllRentalType();
        List<ServiceType> serviceTypes = selectAllServiceType();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FACILITY);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int area = Integer.parseInt(rs.getString("area"));
                int maxPeople = Integer.parseInt(rs.getString("max_people"));
                int rentalCost = Integer.parseInt(rs.getString("rental_cost"));
                String standardRoom = rs.getString("standard_room");
                String description = rs.getString("description");
                double poolArea = Double.parseDouble(rs.getString("pool_area"));
                int floor = Integer.parseInt(rs.getString("floor"));
                int rentalTypeID = Integer.parseInt(rs.getString("type_rental_id"));
                String typeRental = "";
                for (RentalType r : rentalTypes) {
                    if (r.getId() == rentalTypeID) {
                        typeRental = r.getName();
                    }
                }
                int typeServiceID = Integer.parseInt(rs.getString("type_service_id"));
                String typeService = "";
                for (ServiceType s : serviceTypes) {
                    if (s.getId() == typeServiceID) {
                        typeService = s.getName();
                    }
                }
                facilities.add(new Facility(id, name, area, maxPeople, rentalCost, standardRoom, description, poolArea, floor, typeRental, typeService)); {
                };
            }
        } catch (SQLException ignored) {
        }
        return facilities;
    }

    @Override
    public boolean deleteFacility(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateFacility(Facility facility) throws SQLException {
        return false;
    }
}
