package netmehdi.donationms.service;

import netmehdi.donationms.entities.Donation;
import netmehdi.donationms.repo.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService{
    @Autowired
    private DonationRepo donRepo;
    @Override
    public List<Donation> getAllDonations() {
        return donRepo.findAll();
    }

    @Override
    public Donation createDonation(Donation org) {
        donRepo.save(org);
        return org;
    }

    @Override
    public void deleteDonationById(Long id) {
        donRepo.deleteById(id);
    }

    @Override
    public Donation findDonationById(Long id) {
        return donRepo.findById(id).get();
    }

}