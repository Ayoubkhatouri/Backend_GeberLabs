package com.GberLabs.Islamic_Center_Backend.dtos;


import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import lombok.Data;

import java.util.List;

@Data
public class HomePageDTO {
    private Long id;
    private String whoAreWe;
    private String ourVision;
    private List<ServiceDTO>serviceDTOList;
    private List<EventDTO> eventDTOList;
    private List<SlideDTO> slideDTOList;
}
