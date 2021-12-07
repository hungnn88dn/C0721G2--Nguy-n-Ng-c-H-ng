package casestudy.furama4.service.impl.employee;

import casestudy.furama4.models.Position;
import casestudy.furama4.models.User;
import casestudy.furama4.repository.UserRepository;
import casestudy.furama4.repository.employee.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

}
