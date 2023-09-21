package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.PrayerTimeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerTimeEditRequest;
import com.GberLabs.Islamic_Center_Backend.service.PrayerTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prayerTime")
@RequiredArgsConstructor
@CrossOrigin
public class PrayerTimeController {

    private final PrayerTimeService prayerTimeService;

    @PostMapping("/user/create")
    public PrayerTimeDTO createPrayerTime(@RequestBody PrayerTimeDTO prayerTimeDTO){
        return prayerTimeService.savePrayerTime(prayerTimeDTO);
    }

    @GetMapping ("/user/getPrayerTime/{id}")
    public PrayerTimeDTO getPrayerTime(@PathVariable Long id){
        return prayerTimeService.getPrayerTime(id);
    }
    @PutMapping("/user/edit/{id}")
    public PrayerTimeDTO editPrayerTime(@PathVariable Long id, @RequestBody PrayerTimeEditRequest prayerTimeEditRequest){
        return prayerTimeService.editPrayerTime(id,prayerTimeEditRequest);
    }
    @DeleteMapping("/user/delete/{id}")
    public void deletePrayerTime(@PathVariable Long id){
        prayerTimeService.deletePrayerTime(id);
    }
}
