package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.ThemeEditRequest;

import java.util.List;

public interface ThemeService {
    ThemeDTO saveTheme(ThemeDTO themeDTO);
    ThemeDTO getTheme(Long id);
    ThemeDTO editTheme(Long id, ThemeEditRequest themeEditRequest);
    void deleteTheme(Long id);
}
