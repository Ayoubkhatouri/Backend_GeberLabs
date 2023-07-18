package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.entities.Theme;
import com.GberLabs.Islamic_Center_Backend.mappers.ThemeMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.ThemeRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ThemServiceImpl implements ThemeService{

    private ThemeRepository themeRepository;
    private CenterRepository centerRepository;
    private ThemeMapperImpl themeMapper;

    @Override
    public ThemeDTO saveTheme(ThemeDTO themeDTO) {
        Center center=centerRepository.findById(themeDTO.getCenterId()).orElseThrow();
        if(center.getTheme()!=null)
            return themeMapper.fromTheme(center.getTheme());
        Theme theme=themeMapper.fromThemDTO(themeDTO);
        center.setTheme(theme);
        centerRepository.save(center);
        Theme savedTheme=themeRepository.save(theme);
        return themeMapper.fromTheme(savedTheme);
    }

    @Override
    public ThemeDTO getTheme(Long id) {
        return themeMapper.fromTheme(themeRepository.findById(id).orElseThrow());
    }


    @Override
    public void deleteTheme(Long id) {
        Theme theme=themeRepository.findById(id).orElseThrow();
        themeRepository.delete(theme);
    }
}
