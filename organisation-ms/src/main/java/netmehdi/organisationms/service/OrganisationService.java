package netmehdi.organisationms.service;

import netmehdi.organisationms.entities.Organisation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganisationService {
    public List<Organisation> getAllOrganisations();
    public Organisation findOrganisationById(Long id);

    public Organisation createOrganisation(Organisation organisation);
    public Organisation updateOrganisation(Organisation organisation);
    public void deleteOrganisation(Long id);

}