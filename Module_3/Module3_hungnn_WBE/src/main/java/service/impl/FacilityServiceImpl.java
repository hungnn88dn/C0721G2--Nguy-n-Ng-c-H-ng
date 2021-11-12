package service.impl;


import models.Facility;
import repository.FacilityServiceRepo;
import repository.impl.FacilityRepoImpl;
import service.FacilityService;

import java.sql.SQLException;
import java.util.List;

public class FacilityServiceImpl implements FacilityService {
      FacilityServiceRepo facilityServiceRepo = new FacilityRepoImpl();

    @Override
    public void insertFacility(Facility facility) throws SQLException {
           this.facilityServiceRepo.insertFacility(facility);
    }

    @Override
    public Facility selectFacility(int id) {
        return null;
    }

    @Override
    public List<Facility> selectAllFacility() {
        return this.facilityServiceRepo.selectAllFacility();
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
