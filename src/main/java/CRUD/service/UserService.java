package CRUD.service;

import CRUD.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> userList();

}
