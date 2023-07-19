package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.HeaderFooterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.entities.HeaderFooter;
import com.GberLabs.Islamic_Center_Backend.mappers.HeaderFooterMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.HeaderFooterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HeaderFooterServiceImpl implements HeaderFooterService{

    private HeaderFooterRepository headerFooterRepository;
    private HeaderFooterMapperImpl headerFooterMapper;
    private CenterRepository centerRepository;

    @Override
    public HeaderFooterDTO saveHeaderFooter(HeaderFooterDTO headerFooterDTO) {
        Center center=centerRepository.findById(headerFooterDTO.getCenterId()).orElseThrow();
        if(center.getHeaderFooter()!=null)
            return headerFooterMapper.fromHeaderFooter(center.getHeaderFooter());
        HeaderFooter headerFooter=headerFooterMapper.fromHeaderFooterDTO(headerFooterDTO);
        center.setHeaderFooter(headerFooter);
        centerRepository.save(center);
        HeaderFooter savedHeaderFooter=headerFooterRepository.save(headerFooter);
        return headerFooterMapper.fromHeaderFooter(savedHeaderFooter);
    }
}
