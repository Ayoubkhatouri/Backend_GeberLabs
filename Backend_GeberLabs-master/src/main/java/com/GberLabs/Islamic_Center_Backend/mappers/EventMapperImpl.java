package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Event;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventMapperImpl {
    private final HomePageRepository homePageRepository;

    public EventDTO fromEvent(Event event){
        if(event==null)
            return null;
        EventDTO eventDTO=new EventDTO();
        BeanUtils.copyProperties(event,eventDTO);
        eventDTO.setHomPageId(event.getHomePage().getId());
        return eventDTO;
    }
    public Event fromEventDTO(EventDTO eventDTO){
        if(eventDTO==null)
            return null;
        Event event=new Event();
        BeanUtils.copyProperties(eventDTO,event);
        event.setHomePage(homePageRepository.findById(eventDTO.getHomPageId()).orElseThrow());
        return event;
    }
}
