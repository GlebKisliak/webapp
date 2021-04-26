package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.User;
import by.bntu.fitr.pspcoursework.repository.UserRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> findAll(int page, int size) {
        return userRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        userRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int)userRepo.count();
    }

    @Override
    public User findByLoginAndPassword(String login, String password) {
        return userRepo.findUserByLoginAndPassword(login, password);
    }

    @Override
    public User findByLogin(String login) {
        return userRepo.findUserByLogin(login);
    }


}
