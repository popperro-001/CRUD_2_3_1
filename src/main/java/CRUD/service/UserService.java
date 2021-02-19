package CRUD.service;

import CRUD.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> userList();

}
