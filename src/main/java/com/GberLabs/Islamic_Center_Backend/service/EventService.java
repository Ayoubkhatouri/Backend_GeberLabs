package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;

public interface EventService {
    EventDTO saveEvent(EventDTO eventDTO);
}
