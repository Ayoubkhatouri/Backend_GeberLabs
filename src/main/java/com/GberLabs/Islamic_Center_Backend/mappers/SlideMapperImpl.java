package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SlideMapperImpl {
    public SlideDTO fromSlide(Slide slide){
        if(slide==null)return null;
        return null;
    }
    public Slide fromSlideDTO(SlideDTO slideDTO){
        if(slideDTO==null)return null;
        return null;
    }
}
