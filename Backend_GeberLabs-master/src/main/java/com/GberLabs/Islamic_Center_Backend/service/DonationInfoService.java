package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.DonationInfoDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.DonationInfoEditRequest;


public interface DonationInfoService {
    DonationInfoDTO saveDonationInfo(DonationInfoDTO donationInfoDTO);
    DonationInfoDTO getDonationInfo(Long id);
    DonationInfoDTO editDonationInfo(Long id, DonationInfoEditRequest donationInfoEditRequest);
    void deleteDonationInfo(Long id);
}
