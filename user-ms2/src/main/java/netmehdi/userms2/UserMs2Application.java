package netmehdi.userms2;

import netmehdi.userms2.Entities.User;
import netmehdi.userms2.Repositories.UserRepository;
import netmehdi.userms2.enums.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserMs2Application implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserMs2Application.class, args);
    }
    @Override
    public void run(String[] args)throws Exception {
        for(int i=1; i<=10; i++){
            userRepository.save(new User(i,"mohammed","ahmed"+i,(i%2==0)? Gender.FEMALE : Gender.MALE));
        }
    }
}
