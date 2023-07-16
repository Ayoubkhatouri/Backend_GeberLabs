package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
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

    public CenterDTO fromCenter(Center center){
        CenterDTO centerDTO=new CenterDTO();
        BeanUtils.copyProperties(center,centerDTO);
        centerDTO.setOwnerId(center.getUser().getId());
        centerDTO.setDonationDTOList(center.getDonations().stream().map(d->donationMapper.fromDonation(d)).collect(Collectors.toList()));
        centerDTO.setThemeDTO(themeMapper.fromTheme(center.getTheme()));
        return centerDTO;
    }
    public Center fromCenterDTo(CenterDTO centerDTO){
        Center center=new Center();
        BeanUtils.copyProperties(centerDTO,center);
        center.setUser(userRepository.findById(centerDTO.getOwnerId()).orElseThrow());
        center.setDonations(centerDTO.getDonationDTOList().stream().map(d->donationMapper.fromDonationDTO(d)).collect(Collectors.toList()));
        center.setTheme(themeMapper.fromThemDTO(centerDTO.getThemeDTO()));
        return center;
    }
}
