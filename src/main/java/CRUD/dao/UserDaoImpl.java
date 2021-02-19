package CRUD.dao;

import CRUD.models.User;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUser(int id) {

        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User getUserById(int id) {

        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> userList() {

        return entityManager.createQuery("from User").getResultList();
    }
}
