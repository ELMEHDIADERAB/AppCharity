package netmehdi.donationms.repo;


import netmehdi.donationms.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepo extends JpaRepository<Donation, Long> {
}