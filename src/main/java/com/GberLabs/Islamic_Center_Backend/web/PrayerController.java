package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.PrayerDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.ThemeEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import com.GberLabs.Islamic_Center_Backend.service.PrayerService;
import com.GberLabs.Islamic_Center_Backend.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prayer")
@RequiredArgsConstructor
@CrossOrigin
public class PrayerController {
    private final PrayerService prayerService;

    @PostMapping("/user/create")
    public PrayerDTO createPrayer(@RequestBody PrayerDTO prayerDTO){
        return prayerService.savePrayer(prayerDTO);
    }

    @GetMapping ("/user/getPrayer/{id}")
    public PrayerDTO getPrayer(@PathVariable Long id){
        return prayerService.getPrayer(id);
    }
    @PutMapping("/user/edit/{id}")
    public PrayerDTO editPrayer(@PathVariable Long id, @RequestBody PrayerEditRequest prayerEditRequest){
        return prayerService.editPrayer(id,prayerEditRequest);
    }
    @DeleteMapping("/user/delete/{id}")
    public void deletePrayer(@PathVariable Long id){
        prayerService.deletePrayer(id);
    }
}
