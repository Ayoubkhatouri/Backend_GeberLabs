package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.PrayerDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrayerMapperImpl {
    private final HomePageRepository homePageRepository;

    public PrayerDTO fromPrayer(Prayer prayer){
        if(prayer==null) return null;
        PrayerDTO prayerDTO=new PrayerDTO();
        BeanUtils.copyProperties(prayer,prayerDTO);
        prayerDTO.setHomePageId(prayer.getHomePage().getId());
        return prayerDTO;
    }
    public Prayer fromPrayerDTO(PrayerDTO prayerDTO){
        if(prayerDTO==null) return null;
        Prayer prayer=new Prayer();
        BeanUtils.copyProperties(prayerDTO,prayer);
        prayer.setHomePage(homePageRepository.findById(prayerDTO.getHomePageId()).orElseThrow());
        return prayer;
    }
}
