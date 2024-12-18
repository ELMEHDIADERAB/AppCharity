package netmehdi.donationms.entities;

import lombok.Data;

@Data
public class OrganisationEntity {
    private Long id;
    private String name;
    private String address;
    private String contact;
}