package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.ServiceEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.entities.Service;
import com.GberLabs.Islamic_Center_Backend.mappers.ServiceMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.ServiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService{

    private ServiceRepository serviceRepository;
  //  private HomePageRepository homePageRepository;
    private ServiceMapperImpl serviceMapper;

    @Override
    public ServiceDTO saveService(ServiceDTO serviceDTO) {
        Service service =serviceMapper.fromServiceDTO(serviceDTO);
        Service savedService=serviceRepository.save(service);
        return serviceMapper.fromService(savedService);
    }

    @Override
    public ServiceDTO getService(Long id) {
        return serviceMapper.fromService(serviceRepository.findById(id).orElseThrow());
    }

    @Override
    public ServiceDTO editService(Long id, ServiceEditRequest serviceEditRequest) {
        Service service=serviceRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(serviceEditRequest,service);
        Service savedService=serviceRepository.save(service);
        return serviceMapper.fromService(savedService);
    }

    @Override
    public void deleteService(Long id) {
        Service service=serviceRepository.findById(id).orElseThrow();
        serviceRepository.delete(service);
    }
}
