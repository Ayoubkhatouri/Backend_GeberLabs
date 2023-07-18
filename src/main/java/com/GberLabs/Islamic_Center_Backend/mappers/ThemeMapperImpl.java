package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Theme;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ThemeMapperImpl {

    private final CenterRepository centerRepository;
    public ThemeDTO fromTheme(Theme theme){
        if(theme==null) return null;
        ThemeDTO themeDTO=new ThemeDTO();
        BeanUtils.copyProperties(theme,themeDTO);
        themeDTO.setCenterId(theme.getCenter().getId());
        return themeDTO;
    }
    public Theme fromThemDTO(ThemeDTO themeDTO){
        if(themeDTO==null) return null;
        Theme theme=new Theme();
        BeanUtils.copyProperties(themeDTO,theme);
        theme.setCenter(centerRepository.findById(themeDTO.getCenterId()).orElseThrow());
        return theme;
    }
}
