package netmehdi.donationsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonationsMsApplication {
//	private final UserRestClient userRestClient;
//	private final OrganisationRestClient organisationRestClient;
//	private final DonationRepo donationRepo;
//	public DonationMsApplication(UserRestClient userRestClient, OrganisationRestClient organisationRestClient,
//								 DonationRepo donationRepo) {
//		this.userRestClient = userRestClient;
//		this.organisationRestClient = organisationRestClient;
//		this.donationRepo = donationRepo;
//	}
	public static void main(String[] args) {
		SpringApplication.run(DonationsMsApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		Long userId = 1L;
//		Long organisationId = 1L;
//		User user = userRestClient.getUserById(userId);
//		Organisation organisation = organisationRestClient.getOrganisationById(organisationId);
//		Donation donation = new Donation();
//		donation.setDateDonation(new Date());
//		donation.setMontant(500.0);
//		donation.setIdUser(user.getId());
//		donation.setIdOrganisation(organisation.getId());
//		donationRepo.save(donation);
//	}
}
