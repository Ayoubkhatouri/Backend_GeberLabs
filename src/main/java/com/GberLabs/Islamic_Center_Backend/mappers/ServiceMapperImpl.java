package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Serrvice;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceMapperImpl {

    private final HomePageRepository homePageRepository;

    public ServiceDTO fromService(Serrvice serrvice){
        if(serrvice==null)
            return null;
        ServiceDTO serviceDTO=new ServiceDTO();
        BeanUtils.copyProperties(serrvice,serviceDTO);
        serviceDTO.setHomPageId(serrvice.getHomePage().getId());
        return serviceDTO;
    }

    public Serrvice fromServiceDTO(ServiceDTO serviceDTO){
        if(serviceDTO==null) return null;
        Serrvice serrvice=new Serrvice();
        BeanUtils.copyProperties(serviceDTO,serrvice);
        serrvice.setHomePage(homePageRepository.findById(serviceDTO.getHomPageId()).orElseThrow());
        return serrvice;
    }
}
