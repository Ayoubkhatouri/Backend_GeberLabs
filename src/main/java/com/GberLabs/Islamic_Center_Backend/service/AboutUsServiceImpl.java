package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.AboutUsDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.AboutUsEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.AboutUs;
import com.GberLabs.Islamic_Center_Backend.mappers.AboutUsMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.AboutUsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AboutUsServiceImpl implements AboutUsService{
    private AboutUsMapperImpl aboutUsMapper;
    private AboutUsRepository aboutUsRepository;
    @Override
    public AboutUsDTO saveAboutUs(AboutUsDTO aboutUsDTO) {
        AboutUs aboutUs=aboutUsMapper.fromAboutUsDTO(aboutUsDTO);
        AboutUs savedAboutUs=aboutUsRepository.save(aboutUs);
        return aboutUsMapper.fromAboutUs(savedAboutUs);
    }

    @Override
    public AboutUsDTO getAboutUs(Long id) {
        return aboutUsMapper.fromAboutUs(aboutUsRepository.findById(id).orElseThrow());
    }

    @Override
    public AboutUsDTO editAboutUs(Long id, AboutUsEditRequest aboutUsEditRequest) {
        AboutUs aboutUs=aboutUsRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(aboutUsEditRequest,aboutUs);
        AboutUs savedAboutUs=aboutUsRepository.save(aboutUs);
        return aboutUsMapper.fromAboutUs(savedAboutUs);
    }

    @Override
    public void deleteAboutUs(Long id) {
        AboutUs aboutUs=aboutUsRepository.findById(id).orElseThrow();
        aboutUsRepository.delete(aboutUs);
    }
}
