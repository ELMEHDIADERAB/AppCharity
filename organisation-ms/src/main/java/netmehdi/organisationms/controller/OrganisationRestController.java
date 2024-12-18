package netmehdi.organisationms.controller;

import netmehdi.organisationms.Repository.OrganisationRepository;
import netmehdi.organisationms.entities.Organisation;
import netmehdi.organisationms.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organisation")
//@RequestMapping(produces = "application/xml")
public class OrganisationRestController {
    private OrganisationRepository organisationRepository;
    @Autowired
    private OrganisationService organisationService;


    @PostMapping("/creatOrganisation")
    public Organisation createUser(@RequestBody Organisation organisation) {
        return organisationService.createOrganisation(organisation);
    }
    @RequestMapping("/getOrganisationById/{id}")
    public Organisation getOrganisationById(@PathVariable Long id){
        return organisationService.findOrganisationById(id);}
    @PutMapping("/updateOrganisation")
    public Organisation updateUser(@RequestBody Organisation organisation) {
        return organisationService.updateOrganisation(organisation);
    }
    @DeleteMapping("/deleteOrganisation")
    public void deleteUser(@RequestParam("id") Long id) {
        organisationService.deleteOrganisation(id);
    }
    @GetMapping("/organisations")
    public List<Organisation> getAllOrganisations() {
        return organisationRepository.findAll();
    }
}
