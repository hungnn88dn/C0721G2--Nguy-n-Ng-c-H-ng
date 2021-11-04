package service;

import models.Contract;
import java.sql.SQLException;
import java.util.List;

public interface ContractService {
    public void insertContract(Contract contract) throws SQLException;

    public Contract selectContract(int id);

    public List<Contract> selectAllContract();


    public boolean deleteContract(int id) throws SQLException;

    public boolean updateContract(Contract contract) throws SQLException;
}
