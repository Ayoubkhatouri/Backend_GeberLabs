package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.entities.Service;
import com.GberLabs.Islamic_Center_Backend.mappers.ServiceMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.ServiceRepository;
import lombok.AllArgsConstructor;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService{

    private ServiceRepository serviceRepository;
    private HomePageRepository homePageRepository;
    private ServiceMapperImpl serviceMapper;

    @Override
    public ServiceDTO saveService(ServiceDTO serviceDTO) {
        HomePage homePage=homePageRepository.findById(serviceDTO.getHomPageId()).orElseThrow();
        Service service =serviceMapper.fromServiceDTO(serviceDTO);
        homePageRepository.save(homePage);
        Service savedService=serviceRepository.save(service);
        return serviceMapper.fromService(savedService);
    }

    @Override
    public ServiceDTO getService(Long id) {
        return serviceMapper.fromService(serviceRepository.findById(id).orElseThrow());
    }
}
