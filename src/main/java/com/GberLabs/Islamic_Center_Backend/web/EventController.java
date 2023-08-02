package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event")
@RequiredArgsConstructor
@CrossOrigin
public class EventController {
    private final EventService eventService;

    @PostMapping("/user/create")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO){
        return  eventService.saveEvent(eventDTO);
    }

    @GetMapping("/user/getEvent/{id}")
    public EventDTO getEvent(@PathVariable Long id){
        return eventService.getEvent(id);
    }
}
