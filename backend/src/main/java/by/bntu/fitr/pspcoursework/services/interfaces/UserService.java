package by.bntu.fitr.pspcoursework.services.interfaces;

import by.bntu.fitr.pspcoursework.entity.User;

import java.util.List;

public interface UserService {
    User create (User user);
    User findById(int id);
    List<User> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
    User findByLoginAndPassword(String login, String password);
    User findByLogin(String login);
}
