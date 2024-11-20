package netmehdi.organisationms.controller;

import netmehdi.organisationms.Repository.OrganisationRepository;
import netmehdi.organisationms.entities.Organisation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(produces = "application/xml")
public class OrganisationRestController {
    private OrganisationRepository organisationRepository;

    public OrganisationRestController(OrganisationRepository organisationRepository) {
        this.organisationRepository = organisationRepository;
    }
    @GetMapping("/organisations")
    public List<Organisation> getAllOrganisations() {
        return organisationRepository.findAll();
    }
}
