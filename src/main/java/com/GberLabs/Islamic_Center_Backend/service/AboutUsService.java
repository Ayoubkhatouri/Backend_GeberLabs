package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.AboutUsDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.AboutUsEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.ThemeEditRequest;

public interface AboutUsService {
    AboutUsDTO saveAboutUs(AboutUsDTO aboutUsDTO);
    AboutUsDTO getAboutUs(Long id);
    AboutUsDTO editAboutUs(Long id, AboutUsEditRequest aboutUsEditRequest);
    void deleteAboutUs(Long id);
}
