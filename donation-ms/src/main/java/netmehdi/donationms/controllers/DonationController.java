package netmehdi.donationms.controllers;

import netmehdi.donationms.entities.Donation;
import netmehdi.donationms.service.DonationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    private DonationService donationService;

    @RequestMapping("/getAllDonations")
    public List<Donation> getAllDonations(){
        return donationService.getAllDonations();
    }

    @RequestMapping("/getDonationById/{id}")
    public Donation getdonation(@PathVariable Long id){
        return donationService.findDonationById(id);
    }

    @PostMapping("/createDonation")
    public Donation createdonation(@RequestBody Donation org){
        return donationService.createDonation(org);
    }

    @DeleteMapping("/deleteDonationById/{id}")
    public void deleteDonationById(@PathVariable Long id){
        donationService.deleteDonationById(id);
    }
}