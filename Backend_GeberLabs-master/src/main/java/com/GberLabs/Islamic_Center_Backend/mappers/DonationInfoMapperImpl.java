package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.DonationDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.DonationInfoDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Donation;
import com.GberLabs.Islamic_Center_Backend.entities.DonationInfo;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationInfoMapperImpl {

    private final CenterRepository centerRepository;

    public DonationInfoDTO fromDonationInfo(DonationInfo donationInfo){
        if(donationInfo==null) return null;
        DonationInfoDTO donationInfoDTO=new DonationInfoDTO();
        BeanUtils.copyProperties(donationInfo,donationInfoDTO);
        donationInfoDTO.setCenterId(donationInfo.getCenter().getId());
        return donationInfoDTO;
    }
    public DonationInfo fromDonationInfoDTO(DonationInfoDTO donationInfoDTO){
        if(donationInfoDTO==null) return null;
        DonationInfo donationInfo=new DonationInfo();
        BeanUtils.copyProperties(donationInfoDTO,donationInfo);
        donationInfo.setCenter(centerRepository.findById(donationInfoDTO.getCenterId()).orElseThrow());
        return donationInfo;
    }
}
