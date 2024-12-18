package netmehdi.organisationms.service;

import netmehdi.organisationms.Repository.OrganisationRepository;
import netmehdi.organisationms.entities.Organisation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrganisationServiceImpl implements OrganisationService{
    @Autowired
    private OrganisationRepository organisationRepo;

    @Override
    public List<Organisation> getAllOrganisations() {
        return organisationRepo.findAll();
    }

    @Override
    public Organisation findOrganisationById(Long id) {
        return organisationRepo.findById(id).get();
    }

    @Override
    public Organisation createOrganisation(Organisation organisation) {
        return organisationRepo.save(organisation);
    }

    @Override
    public Organisation updateOrganisation(Organisation organisation) {
        return organisationRepo.save(organisation);
    }

    @Override
    public void deleteOrganisation(Long id) {
        organisationRepo.deleteById(id);
    }
}