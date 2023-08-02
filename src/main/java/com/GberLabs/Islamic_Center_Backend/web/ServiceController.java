package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service")
@RequiredArgsConstructor
@CrossOrigin
public class ServiceController {
    private final ServiceService serviceService;

    @PostMapping("/user/create")
    public ServiceDTO createService(@RequestBody ServiceDTO serviceDTO){
        return serviceService.saveService(serviceDTO);
    }

    @GetMapping("/user/getService/{id}")
    public ServiceDTO getService(@PathVariable Long id){
        return serviceService.getService(id);
    }
}
