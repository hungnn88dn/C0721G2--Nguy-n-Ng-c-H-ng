package excercise.service.impl;

import excercise.bean.Dictionary;
import excercise.repository.IRepo;
import excercise.repository.impl.RepoImpl;
import excercise.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class ServiceImpl implements IService {


    private IRepo iRepo = new RepoImpl();

    @Override
    public Map<String, Dictionary> findAll() {
        return iRepo.findAll();
    }
}
