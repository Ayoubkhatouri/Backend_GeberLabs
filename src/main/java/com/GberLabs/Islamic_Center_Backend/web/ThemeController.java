package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.service.ThemServiceImpl;
import com.GberLabs.Islamic_Center_Backend.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/theme")
@RequiredArgsConstructor
@CrossOrigin
public class ThemeController {
    private final ThemeService themeService;

    @PostMapping("/user/create")
    public ThemeDTO createTheme(@RequestBody ThemeDTO themeDTO){
        return themeService.saveTheme(themeDTO);
    }

    @GetMapping ("/user/getTheme/{id}")
    public ThemeDTO getTheme(@PathVariable Long id){
        return themeService.getTheme(id);
    }

}
