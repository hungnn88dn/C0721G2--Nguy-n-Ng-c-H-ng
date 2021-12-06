package casestudy.furama4.service.impl.employee;

import casestudy.furama4.models.Position;
import casestudy.furama4.repository.employee.PositionRepository;
import casestudy.furama4.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return this.positionRepository.findAll();
    }
}
