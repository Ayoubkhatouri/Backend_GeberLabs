package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.DonationInfoDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.DonationInfoEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.SlideEditRequest;
import com.GberLabs.Islamic_Center_Backend.service.DonationInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/donationInfo")
@RequiredArgsConstructor
@CrossOrigin
public class DonationInfoController {

    private final DonationInfoService donationInfoService;


    @PostMapping("/user/create")
    public DonationInfoDTO createDonationInfo(@RequestBody DonationInfoDTO donationInfoDTO){
        return donationInfoService.saveDonationInfo(donationInfoDTO);
    }

    @GetMapping("/user/getDonationInfo/{id}")
    public DonationInfoDTO getDonationInfo(@PathVariable Long id){
        return donationInfoService.getDonationInfo(id);
    }

    @PutMapping("/user/edit/{id}")
    public DonationInfoDTO editDonationInfo(@PathVariable Long id, @RequestBody DonationInfoEditRequest donationInfoEditRequest){
        return donationInfoService.editDonationInfo(id,donationInfoEditRequest);
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteDonationInfo(@PathVariable Long id){
        donationInfoService.deleteDonationInfo(id);
    }

}
