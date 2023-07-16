package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Theme;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ThemeMapperImpl {
    public ThemeDTO fromTheme(Theme theme){
        if(theme==null) return null;
        return null;
    }
    public Theme fromThemDTO(ThemeDTO themeDTO){
        if(themeDTO==null) return null;
        return null;
    }
}
