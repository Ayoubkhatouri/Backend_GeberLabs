package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.SlideEditRequest;

public interface SlideSerive {
    SlideDTO saveSlide(SlideDTO slideDTO);
    SlideDTO getSlide(Long id);
    SlideDTO editSlide(Long id, SlideEditRequest slideEditRequest);
    void deleteSlide(Long id);
}
