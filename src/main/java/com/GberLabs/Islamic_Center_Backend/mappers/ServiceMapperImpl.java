package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Service;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceMapperImpl {

    private final HomePageRepository homePageRepository;

    public ServiceDTO fromService(Service service){
        if(service ==null)
            return null;
        ServiceDTO serviceDTO=new ServiceDTO();
        BeanUtils.copyProperties(service,serviceDTO);
        serviceDTO.setHomPageId(service.getHomePage().getId());
        return serviceDTO;
    }

    public Service  fromServiceDTO(ServiceDTO serviceDTO){
        if(serviceDTO==null) return null;
        Service service =new Service();
        BeanUtils.copyProperties(serviceDTO, service);
        service.setHomePage(homePageRepository.findById(serviceDTO.getHomPageId()).orElseThrow());
        return service;

    }
}
