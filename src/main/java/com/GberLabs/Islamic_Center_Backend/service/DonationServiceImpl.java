package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.entities.Donation;
import com.GberLabs.Islamic_Center_Backend.repositories.DonationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DonationServiceImpl implements DonationService{

    private DonationRepository donationRepository;

    @Override
    public void deleteDonation(Long id) {
        Donation donation=donationRepository.findById(id).orElseThrow();
        donationRepository.delete(donation);
    }
}
