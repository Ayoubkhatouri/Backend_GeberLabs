package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.DonationDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Donation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationMapperImpl {
    public DonationDTO fromDonation(Donation donation){
        if(donation==null) return null;
        return null;
    }
    public Donation fromDonationDTO(DonationDTO donationDTO){
        if(donationDTO==null) return null;
        return null;
    }
}
