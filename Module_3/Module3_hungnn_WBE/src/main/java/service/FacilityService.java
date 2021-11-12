package service;

import models.Employee;
import models.Facility;

import java.sql.SQLException;
import java.util.List;

public interface FacilityService  {
    public void insertFacility(Facility facility) throws SQLException;

    public Facility selectFacility(int id);

    public List<Facility> selectAllFacility();


    public boolean deleteFacility(int id) throws SQLException;

    public boolean updateFacility(Facility facility) throws SQLException;
}
