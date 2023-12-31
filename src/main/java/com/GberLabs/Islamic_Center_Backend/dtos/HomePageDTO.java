package com.GberLabs.Islamic_Center_Backend.dtos;


import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class  HomePageDTO {
    private Long id;
    private String eventBorderColor;
    private String eventBgColor;
    private String eventAdditionalInfoColor;
    private String iconSlidesColor;
    private String iconSlidesBgColor;
    private List<ServiceDTO>serviceDTOList=new ArrayList<>();
    private List<EventDTO> eventDTOList=new ArrayList<>();
    private List<SlideDTO> slideDTOList=new ArrayList<>();
    private List<TestimonialDTO> testimonialDTOList=new ArrayList<>();
    private List<AboutUsDTO> aboutUsDTOList=new ArrayList<>();
    private PrayerDTO prayerDTO;
    private Long centerId;
}
