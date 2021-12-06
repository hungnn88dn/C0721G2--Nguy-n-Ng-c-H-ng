package casestudy.furama4.service;


import casestudy.furama4.models.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionService {
    public List<Position> findAll();
}
