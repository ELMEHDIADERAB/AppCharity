package netmehdi.organisationms;

import netmehdi.organisationms.Repository.OrganisationRepository;
import netmehdi.organisationms.entities.Organisation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class OrganisationMsApplication implements CommandLineRunner {
    @Autowired
    private OrganisationRepository organisationRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrganisationMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            organisationRepository.save(new Organisation(i, "org" + i, "des" + i, "loc" + i));
        }
    }
}
