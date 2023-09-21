package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.HeaderFooterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.HeaderFooter;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeaderFooterMapperImpl {

    private final CenterRepository centerRepository;

    public HeaderFooterDTO fromHeaderFooter(HeaderFooter headerFooter){
        if(headerFooter==null)  return null;
        HeaderFooterDTO headerFooterDTO=new HeaderFooterDTO();
        BeanUtils.copyProperties(headerFooter,headerFooterDTO);
        if(headerFooter.getCenter()!=null)
        headerFooterDTO.setCenterId(headerFooter.getCenter().getId());
        return headerFooterDTO;
    }
    public HeaderFooter fromHeaderFooterDTO(HeaderFooterDTO headerFooterDTO){
        if(headerFooterDTO==null) return null;
        HeaderFooter headerFooter=new HeaderFooter();
        BeanUtils.copyProperties(headerFooterDTO,headerFooter);
        headerFooter.setCenter(centerRepository.findById(headerFooterDTO.getCenterId()).orElseThrow());
        return headerFooter;
    }
}
