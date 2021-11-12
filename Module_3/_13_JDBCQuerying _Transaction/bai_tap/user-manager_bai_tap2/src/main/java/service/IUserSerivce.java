package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserSerivce {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUserStore(int id) throws SQLException;

    boolean updateUserStore(User user) throws SQLException;

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    public List<User> selectAllUsersSort();
    void addUserTransaction(User user, int[] permision);

    List<User> showAllUserStore() ;
}
