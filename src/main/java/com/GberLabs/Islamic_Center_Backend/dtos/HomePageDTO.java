package com.GberLabs.Islamic_Center_Backend.dtos;


import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class  HomePageDTO {
    private Long id;
    private String whoAreWe;
    private String ourVision;
    private String eventBorderColor;
    private String eventBgColor;
    private String eventAdditionalInfoColor;
    private String iconSlidesColor;
    private List<ServiceDTO>serviceDTOList=new ArrayList<>();
    private List<EventDTO> eventDTOList=new ArrayList<>();
    private List<SlideDTO> slideDTOList=new ArrayList<>();
    private Long centerId;
}
