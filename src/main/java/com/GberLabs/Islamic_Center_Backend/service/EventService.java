package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.EventEditRequest;

public interface EventService {
    EventDTO saveEvent(EventDTO eventDTO);
    EventDTO getEvent(Long id);

    EventDTO editEvent(Long id , EventEditRequest eventEditRequest);
    void deleteEvent(Long id);
}
