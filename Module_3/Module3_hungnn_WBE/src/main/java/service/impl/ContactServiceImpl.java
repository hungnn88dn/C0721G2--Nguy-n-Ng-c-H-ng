package service.impl;
import models.Contract;
import repository.ContractServiceRepo;
import repository.impl.ContactRepoImpl;
import service.ContractService;

import java.sql.SQLException;
import java.util.List;


public class ContactServiceImpl implements ContractService {
      ContractServiceRepo contractServiceRepo = new ContactRepoImpl();

    @Override
    public void insertContract(Contract contract) throws SQLException {
          this.contractServiceRepo.insertContract(contract);
    }

    @Override
    public Contract selectContract(int id) {
        return null;
    }

    @Override
    public List<Contract> selectAllContract() {
        return this.contractServiceRepo.selectAllContract();
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
