package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.ServiceDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Serrvice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceMapperImpl {

    public ServiceDTO fromService(Serrvice serrvice){
        if(serrvice==null)
            return null;
        return null;
    }

    public Serrvice fromServiceDTO(ServiceDTO serviceDTO){
        if(serviceDTO==null) return null;
        return null;
    }
}
