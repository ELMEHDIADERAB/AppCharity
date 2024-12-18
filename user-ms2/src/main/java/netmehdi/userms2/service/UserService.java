package netmehdi.userms2.service;

import netmehdi.userms2.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAllUsers();
    public User findUserById(Long id);

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long id);


}