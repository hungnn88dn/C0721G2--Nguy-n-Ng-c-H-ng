package casestudy.furama4.service.impl.employee;

import casestudy.furama4.models.Level;
import casestudy.furama4.repository.employee.LevelRepository;
import casestudy.furama4.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    private LevelRepository levelRepository;

    @Override
    public List<Level> findAll() {
        return this.levelRepository.findAll();
    }
}
