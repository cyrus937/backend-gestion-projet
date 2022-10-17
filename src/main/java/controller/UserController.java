package controller;

import model.Login;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public User signup(@RequestBody User user){
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody Login lo) throws Exception {
        User user = userService.getUser(lo.getUsername());
        if (user == null){
            throw new Exception("User Not Found");
        }
        return user;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAlluser(){
        return userService.getAllUser();
    }

    @RequestMapping(path = "/simple", method = RequestMethod.GET)
    public List<User> getAllSimpleUser(){
        return userService.getAllSimpleUsers();
    }

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public List<User> getAllAdminUser(){
        return userService.getAllAdmin();
    }

    @RequestMapping(value = "/byposte/{poste}", method = RequestMethod.GET)
    public List<User> getUserByPoste(@PathVariable("id") String poste){
        return userService.findByPoste(poste);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") String id){
        return userService.getUserById(id);
    }
}
