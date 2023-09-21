package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.ServiceEditRequest;

public interface ServiceService {
    ServiceDTO saveService(ServiceDTO serviceDTO);
    ServiceDTO getService(Long id);
    ServiceDTO editService(Long id, ServiceEditRequest serviceEditRequest);
    void deleteService(Long id);
}
