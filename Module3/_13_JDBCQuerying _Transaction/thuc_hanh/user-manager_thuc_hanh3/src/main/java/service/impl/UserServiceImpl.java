package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRipository;
import service.IUserSerivce;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserSerivce {
    private IUserRepository iStudentRepository = new UserRipository();

    @Override
    public void insertUser(User user) throws SQLException {
        iStudentRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return this.iStudentRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return this.iStudentRepository.selectAllUsers();
    }

    @Override
    public List<User> selectAllUsersSort() {
        return this.iStudentRepository.selectAllUsersSort();
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        this.iStudentRepository.addUserTransaction(user,permision);
    }

    @Override
    public void insertUpdateWithoutTransaction() {
        this.iStudentRepository.insertUpdateWithoutTransaction();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return this.iStudentRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return this.iStudentRepository.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {

    }
}
