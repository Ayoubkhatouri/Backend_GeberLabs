package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.SlideEditRequest;
import com.GberLabs.Islamic_Center_Backend.repositories.SlideRepository;
import com.GberLabs.Islamic_Center_Backend.service.SlideSerive;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/slide")
@RequiredArgsConstructor
@CrossOrigin
public class SlideController {
    private final SlideSerive slideSerive;

    @PostMapping("/user/create")
    public SlideDTO createSlide(@RequestBody SlideDTO slideDTO){
        return slideSerive.saveSlide(slideDTO);
    }

    @GetMapping("/user/getSlide/{id}")
    public SlideDTO getSlide(@PathVariable Long id){
        return slideSerive.getSlide(id);
    }

    @PutMapping("/user/edit/{id}")
    public SlideDTO editSlide(@PathVariable Long id, @RequestBody SlideEditRequest slideEditRequest){
        return slideSerive.editSlide(id,slideEditRequest);
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteSlide(@PathVariable Long id){
        slideSerive.deleteSlide(id);
    }
}
