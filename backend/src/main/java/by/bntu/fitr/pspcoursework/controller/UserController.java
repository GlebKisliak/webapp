package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.User;
import by.bntu.fitr.pspcoursework.services.implementation.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);

    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @GetMapping("/find-all")
    public List<User> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return userService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        userService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return userService.getSize();
    }

    @GetMapping("/find-by-login-and-password")
    public User findByLoginAndPassword(@RequestParam String login,@RequestParam String password) {
        return userService.findByLoginAndPassword(login,password);
    }

    @GetMapping("/find-by-login")
    public User findByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }
}
