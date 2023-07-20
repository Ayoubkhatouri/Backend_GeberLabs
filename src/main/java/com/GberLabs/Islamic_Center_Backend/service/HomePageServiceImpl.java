package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.HomePageDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.mappers.CenterMapperImpl;
import com.GberLabs.Islamic_Center_Backend.mappers.HomePageMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class HomePageServiceImpl implements HomePageService{

    private CenterRepository centerRepository;
    private HomePageMapperImpl homePageMapper;
    private HomePageRepository homePageRepository;

    @Override
    public HomePageDTO saveHomePage(HomePageDTO homePageDTO) {
        Center center=centerRepository.findById(homePageDTO.getCenterId()).orElseThrow();
        if(center.getHomePage()!=null)
            return homePageMapper.fromHomePage(center.getHomePage());
        HomePage homePage=homePageMapper.fromHomePageDTO(homePageDTO);
        center.setHomePage(homePage);
        centerRepository.save(center);
        HomePage savedHomePage=homePageRepository.save(homePage);
        return homePageMapper.fromHomePage(savedHomePage);
    }

    @Override
    public HomePageDTO getHomePage(Long id) {
        return homePageMapper.fromHomePage(homePageRepository.findById(id).orElseThrow());
    }
}
