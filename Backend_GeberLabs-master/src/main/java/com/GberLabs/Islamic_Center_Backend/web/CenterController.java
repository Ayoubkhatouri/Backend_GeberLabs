package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.CenterEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.service.CenterService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/center")
@RequiredArgsConstructor
@CrossOrigin
public class CenterController {
    private final CenterService centerService;

    @PostMapping("/user/create")
    public CenterDTO createCenter(@RequestBody CenterDTO centerDTO){
        return centerService.saveCenter(centerDTO);
    }
    @GetMapping("/user/getAll")
    public List<CenterDTO> getAllCenters(){
        return centerService.getAllCenters();
    }
    @GetMapping("/user/getCenter/{id}")
    public CenterDTO getCenter(@PathVariable Long id){
        return centerService.getCenter(id);
    }
    @PutMapping("/user/edit/{id}")
    public  CenterDTO editCenter(@PathVariable Long id,@RequestBody CenterEditRequest centerEditRequest){
        return centerService.editCenter(id,centerEditRequest);
    }
    @DeleteMapping("/user/delete/{id}")
    public void deleteCenter(@PathVariable Long id){
        centerService.deleteCenter(id);
    }
}

