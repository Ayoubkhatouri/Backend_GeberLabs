package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.HomePageDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.HeaderFooterEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.HomePageEditRequest;

public interface HomePageService {

    HomePageDTO saveHomePage(HomePageDTO homePageDTO);
    HomePageDTO getHomePage(Long id);
    HomePageDTO editHomePage(Long id, HomePageEditRequest homePageEditRequest);
}
