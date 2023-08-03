package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.HomePageDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.HomePageEditRequest;
import com.GberLabs.Islamic_Center_Backend.service.HomePageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/homePage")
@RequiredArgsConstructor
@CrossOrigin
public class HomePageController {
    private final HomePageService homePageService;

    @PostMapping("/user/create")
    public HomePageDTO createHomePage(@RequestBody HomePageDTO homePageDTO){
        return homePageService.saveHomePage(homePageDTO);
    }
    @GetMapping("/user/getHomePage/{id}")
    public HomePageDTO getHomePage(@PathVariable Long id){
        return homePageService.getHomePage(id);
    }

    @PutMapping("/user/edit/{id}")
    public HomePageDTO editHomePage(@PathVariable Long id,@RequestBody HomePageEditRequest homePageEditRequest){
        return homePageService.editHomePage(id,homePageEditRequest);
    }
}
