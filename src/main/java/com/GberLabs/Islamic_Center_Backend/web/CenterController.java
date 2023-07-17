package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.service.CenterService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/center")
@RequiredArgsConstructor
public class CenterController {
    private final CenterService centerService;

    @PostMapping("/admin/create")
    public CenterDTO createCenter(@RequestBody CenterDTO centerDTO){
        return centerService.saveCenter(centerDTO);
    }
    @GetMapping("/anyOne/getAll")
    public List<CenterDTO> getAllCenters(){
        return centerService.getAllCenters();
    }
    @GetMapping("/anyOne/getCenter/{id}")
    public CenterDTO getCenter(@PathVariable Long id){
        return centerService.getCenter(id);
    }
    @PutMapping("/admin/edit/{id}")
    public  CenterDTO editCenter(@PathVariable Long id,@RequestBody CenterEditRequest centerEditRequest){
        return centerService.editCenter(id,centerEditRequest.name, centerEditRequest.description, centerEditRequest.address);
    }
    @DeleteMapping("/admin/delete/{id}")
    public void deleteCenter(@PathVariable Long id){
        centerService.deleteCenter(id);
    }
}

@Data
class CenterEditRequest{
    String name;
    String description;
    String address;
}
