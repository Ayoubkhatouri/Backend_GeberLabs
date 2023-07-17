package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.entities.Theme;
import com.GberLabs.Islamic_Center_Backend.repositories.ThemeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ThemServiceImpl implements ThemeService{

    private ThemeRepository themeRepository;

    @Override
    public void deleteTheme(Long id) {
        Theme theme=themeRepository.findById(id).orElseThrow();
        themeRepository.delete(theme);
    }
}
