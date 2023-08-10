package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.AboutUsDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.TestimonialDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.AboutUsEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.TestimonialEditRequest;
import com.GberLabs.Islamic_Center_Backend.service.AboutUsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aboutUs")
@RequiredArgsConstructor
@CrossOrigin
public class AboutUsController {

    private final AboutUsService aboutUsService;


    @PostMapping("/user/create")
    public AboutUsDTO createAboutUs(@RequestBody AboutUsDTO aboutUsDTO){
        return  aboutUsService.saveAboutUs(aboutUsDTO);
    }

    @GetMapping("/user/getAboutUs/{id}")
    public AboutUsDTO getAboutUs(@PathVariable Long id){
        return aboutUsService.getAboutUs(id);
    }

    @PutMapping("/user/edit/{id}")
    public AboutUsDTO editAboutUs(@PathVariable Long id, @RequestBody AboutUsEditRequest aboutUsEditRequest){
        return aboutUsService.editAboutUs(id,aboutUsEditRequest);
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteAboutUs(@PathVariable Long id){
        aboutUsService.deleteAboutUs(id);
    }
}
