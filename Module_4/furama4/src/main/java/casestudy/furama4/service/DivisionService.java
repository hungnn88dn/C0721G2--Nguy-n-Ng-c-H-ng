package casestudy.furama4.service;

import casestudy.furama4.models.Division;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisionService {
    public List<Division> findAll();
}
