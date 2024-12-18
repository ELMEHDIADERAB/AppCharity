package netmehdi.userms2.service;

import netmehdi.userms2.Entities.User;
import netmehdi.userms2.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRep;

    @Override
    public List<User> getAllUsers() {
        return userRep.findAll();
    }
    @Override
    public User findUserById(Long id) {
        return userRep.findById(id).get();
    }
    @Override
    public User createUser(User user) {
        return userRep.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRep.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }
}