package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;

import java.util.List;

public interface ThemeService {
    ThemeDTO saveTheme(ThemeDTO themeDTO);
    ThemeDTO getTheme(Long id);
    void deleteTheme(Long id);
}
