package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.service.CenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/center")
@RequiredArgsConstructor
public class CenterController {
    private final CenterService centerService;

    @PostMapping("/admin/create")
    public Center createCenter(@RequestBody CenterDTO centerDTO){
        return centerService.saveCenter(centerDTO);
    }
}
