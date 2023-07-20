package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventMapperImpl {
    public EventDTO fromEvent(Event event){
        if(event==null)
            return null;
        return null;
    }
    public Event fromEventDTO(EventDTO eventDTO){
        if(eventDTO==null)
            return null;
        return null;
    }
}
