package netmehdi.userms2.Controller;

import netmehdi.userms2.Entities.User;
import netmehdi.userms2.Repositories.UserRepository;
import netmehdi.userms2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserRestController {
    @Autowired
    private UserService userService;
    @GetMapping("/listUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @PostMapping("/creatuser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }
}