package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Event;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.mappers.EventMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.EventRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService{

 //   private HomePageRepository homePageRepository;
    private EventMapperImpl eventMapper;
    private EventRepository eventRepository;

    @Override
    public EventDTO saveEvent(EventDTO eventDTO) {
        Event event=eventMapper.fromEventDTO(eventDTO);
        Event savedEvent=eventRepository.save(event);
        return eventMapper.fromEvent(savedEvent);
    }

    @Override
    public EventDTO getEvent(Long id) {
        return eventMapper.fromEvent(eventRepository.findById(id).orElseThrow());
    }
}
