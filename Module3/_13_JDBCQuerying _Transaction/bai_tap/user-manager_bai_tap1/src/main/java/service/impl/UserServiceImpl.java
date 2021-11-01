package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRipository;
import service.IUserSerivce;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserSerivce {
    private IUserRepository iUserRepository = new UserRipository();

    @Override
    public void insertUser(User user) throws SQLException {
        iUserRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return this.iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return this.iUserRepository.selectAllUsers();
    }

    @Override
    public List<User> selectAllUsersSort() {
        return this.iUserRepository.selectAllUsersSort();
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        this.iUserRepository.addUserTransaction(user,permision);
    }

    @Override
    public List<User> showAllUserStore() {
        return this.iUserRepository.showAllUserStore();
    }

    @Override
    public boolean deleteUserStore(int id) throws SQLException {
        return this.iUserRepository.deleteUserStore(id);
    }

    @Override
    public boolean updateUserStore(User user) throws SQLException {
        return this.iUserRepository.updateUserStore(user);
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {

    }
}
