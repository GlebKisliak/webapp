package by.bntu.fitr.pspcoursework.repository;


import by.bntu.fitr.pspcoursework.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findUserByLogin(String login);
    User findUserByLoginAndPassword(String login, String password);
}
