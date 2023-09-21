package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.PrayerTimeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerTimeEditRequest;

public interface PrayerTimeService {
    PrayerTimeDTO savePrayerTime(PrayerTimeDTO prayerTimeDTO);
    PrayerTimeDTO getPrayerTime(Long id);
    PrayerTimeDTO editPrayerTime(Long id, PrayerTimeEditRequest prayerTimeEditRequest);
    void deletePrayerTime(Long id);
}
