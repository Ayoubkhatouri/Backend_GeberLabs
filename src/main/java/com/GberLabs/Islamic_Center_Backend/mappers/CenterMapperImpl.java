package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.repositories.DonationInfoRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CenterMapperImpl {

    private final DonationMapperImpl donationMapper;
    private final ThemeMapperImpl themeMapper;
    private final UserRepository userRepository;
    private final HeaderFooterMapperImpl headerFooterMapper;
    private final HomePageMapperImpl homePageMapper;
    private final DonationInfoMapperImpl donationInfoMapper;

    public CenterDTO fromCenter(Center center){
        if(center==null) return null;
        CenterDTO centerDTO=new CenterDTO();
        BeanUtils.copyProperties(center,centerDTO);
        centerDTO.setOwnerId(center.getUser().getId());
        centerDTO.setDonationDTOList(center.getDonations().stream().map(d->donationMapper.fromDonation(d)).collect(Collectors.toList()));
        centerDTO.setThemeDTO(themeMapper.fromTheme(center.getTheme()));
        centerDTO.setHeaderFooterDTO(headerFooterMapper.fromHeaderFooter(center.getHeaderFooter()));
        centerDTO.setHomePageDTO(homePageMapper.fromHomePage(center.getHomePage()));
        centerDTO.setDonationInfoDTO(donationInfoMapper.fromDonationInfo(center.getDonationInfo()));
        return centerDTO;
    }
    public Center fromCenterDTo(CenterDTO centerDTO){
        if(centerDTO==null) return null;
        Center center=new Center();
        BeanUtils.copyProperties(centerDTO,center);
        center.setUser(userRepository.findById(centerDTO.getOwnerId()).orElseThrow());
        center.setDonations(centerDTO.getDonationDTOList().stream().map(d->donationMapper.fromDonationDTO(d)).collect(Collectors.toList()));
        center.setTheme(themeMapper.fromThemDTO(centerDTO.getThemeDTO()));
        center.setHeaderFooter(headerFooterMapper.fromHeaderFooterDTO(centerDTO.getHeaderFooterDTO()));
        center.setHomePage(homePageMapper.fromHomePageDTO(centerDTO.getHomePageDTO()));
        center.setDonationInfo(donationInfoMapper.fromDonationInfoDTO(centerDTO.getDonationInfoDTO()));
        return center;
    }
}
