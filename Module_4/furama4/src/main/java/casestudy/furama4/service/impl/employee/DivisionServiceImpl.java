package casestudy.furama4.service.impl.employee;

import casestudy.furama4.models.Division;
import casestudy.furama4.repository.employee.DivisionRepository;
import casestudy.furama4.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return this.divisionRepository.findAll();
    }
}
