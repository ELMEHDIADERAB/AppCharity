package netmehdi.userms2.Controller;

import netmehdi.userms2.Entities.User;
import netmehdi.userms2.Repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = "application/xml")
public class UserRestController {
    private UserRepository userRepository;
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<User> userList() {
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public User user(@PathVariable long id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("User with id %s not found", id)));
    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user) {
        User userById = userRepository.findById(id).get();
        if(user.getNom()!=null) userById.setNom(user.getNom());
        if (user.getPrenom()!=null) userById.setPrenom(user.getPrenom());
        return userRepository.save(userById);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
    }
}
