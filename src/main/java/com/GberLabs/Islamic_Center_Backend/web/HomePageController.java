package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.HomePageDTO;
import com.GberLabs.Islamic_Center_Backend.service.HomePageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/homePage")
@RequiredArgsConstructor
@CrossOrigin
public class HomePageController {
    private final HomePageService homePageService;

    @PostMapping("/admin/create")
    public HomePageDTO createHomePage(@RequestBody HomePageDTO homePageDTO){
        return homePageService.saveHomePage(homePageDTO);
    }
}
