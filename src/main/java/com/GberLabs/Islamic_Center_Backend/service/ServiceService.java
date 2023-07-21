package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;

public interface ServiceService {
    ServiceDTO saveService(ServiceDTO serviceDTO);
    ServiceDTO getService(Long id);
}
