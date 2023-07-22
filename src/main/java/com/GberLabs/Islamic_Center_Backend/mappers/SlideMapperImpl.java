package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.SlideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SlideMapperImpl {

    private final HomePageRepository   homePageRepository;

    public SlideDTO fromSlide(Slide slide){
        if(slide==null)return null;
        SlideDTO slideDTO=new SlideDTO();
        BeanUtils.copyProperties(slide,slideDTO);
        slideDTO.setHomePageId(slide.getHomePage().getId());
        return slideDTO;
    }
    public Slide fromSlideDTO(SlideDTO slideDTO){
        if(slideDTO==null)return null;
        Slide slide=new Slide();
        BeanUtils.copyProperties(slideDTO,slide);
        slide.setHomePage(homePageRepository.findById(slideDTO.getHomePageId()).orElseThrow());
        return slide;
    }
}
