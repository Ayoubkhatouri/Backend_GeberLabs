package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.DonationInfoDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.DonationInfoEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.entities.DonationInfo;
import com.GberLabs.Islamic_Center_Backend.mappers.DonationInfoMapperImpl;
import com.GberLabs.Islamic_Center_Backend.mappers.DonationMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.DonationInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DonationInfoServiceImpl implements DonationInfoService{

    private CenterRepository centerRepository;
    private DonationInfoMapperImpl donationInfoMapper;
    private DonationInfoRepository donationInfoRepository;

    @Override
    public DonationInfoDTO saveDonationInfo(DonationInfoDTO donationInfoDTO) {
        Center center=centerRepository.findById(donationInfoDTO.getCenterId()).orElseThrow();
        if(center.getDonationInfo()!=null)
            return donationInfoMapper.fromDonationInfo(center.getDonationInfo());
        DonationInfo donationInfo=donationInfoMapper.fromDonationInfoDTO(donationInfoDTO);
        center.setDonationInfo(donationInfo);
        centerRepository.save(center);
        DonationInfo savedDonationInfo=donationInfoRepository.save(donationInfo);
        return donationInfoMapper.fromDonationInfo(savedDonationInfo);
    }

    @Override
    public DonationInfoDTO getDonationInfo(Long id) {
        return donationInfoMapper.fromDonationInfo(donationInfoRepository.findById(id).orElseThrow());
    }

    @Override
    public DonationInfoDTO editDonationInfo(Long id, DonationInfoEditRequest donationInfoEditRequest) {
        DonationInfo donationInfo=donationInfoRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(donationInfoEditRequest,donationInfo);
        DonationInfo savedDonationInfo=donationInfoRepository.save(donationInfo);
        return donationInfoMapper.fromDonationInfo(savedDonationInfo);
    }

    @Override
    public void deleteDonationInfo(Long id) {
        DonationInfo donationInfo=donationInfoRepository.findById(id).orElseThrow();
        donationInfoRepository.delete(donationInfo);
    }
}
