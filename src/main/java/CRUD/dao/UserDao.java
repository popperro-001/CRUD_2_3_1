package CRUD.dao;

import CRUD.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> userList();

}
