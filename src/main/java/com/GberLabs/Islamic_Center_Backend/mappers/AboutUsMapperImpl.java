package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.AboutUsDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.DonationDTO;
import com.GberLabs.Islamic_Center_Backend.entities.AboutUs;
import com.GberLabs.Islamic_Center_Backend.entities.Donation;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutUsMapperImpl {

    private final HomePageRepository homePageRepository;

    public AboutUsDTO fromAboutUs(AboutUs aboutUs){
        if(aboutUs==null) return null;
        AboutUsDTO aboutUsDTO=new AboutUsDTO();
        BeanUtils.copyProperties(aboutUs,aboutUsDTO);
        aboutUsDTO.setHomePageId(aboutUs.getHomePage().getId());
        return aboutUsDTO;
    }
    public AboutUs fromAboutUsDTO(AboutUsDTO aboutUsDTO){
        if(aboutUsDTO==null) return null;
        AboutUs aboutUs=new AboutUs();
        BeanUtils.copyProperties(aboutUsDTO,aboutUs);
        aboutUs.setHomePage(homePageRepository.findById(aboutUsDTO.getHomePageId()).orElseThrow());
        return aboutUs;
    }
}
