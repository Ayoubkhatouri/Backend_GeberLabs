package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.PrayerDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.ThemeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.ThemeEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;

public interface PrayerService {
    PrayerDTO savePrayer(PrayerDTO prayerDTO);
    PrayerDTO getPrayer(Long id);
    PrayerDTO editPrayer(Long id, PrayerEditRequest prayerEditRequest);
    void deletePrayer(Long id);
}
