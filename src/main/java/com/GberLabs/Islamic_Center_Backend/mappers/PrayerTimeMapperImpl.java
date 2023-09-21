package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.PrayerDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.PrayerTimeDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import com.GberLabs.Islamic_Center_Backend.entities.PrayerTime;
import com.GberLabs.Islamic_Center_Backend.repositories.PrayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrayerTimeMapperImpl {
    private final PrayerRepository prayerRepository;

    public PrayerTimeDTO fromPrayerTime(PrayerTime prayerTime) {
        if(prayerTime==null) return null;
        PrayerTimeDTO prayerTimeDTO=new PrayerTimeDTO();
        BeanUtils.copyProperties(prayerTime,prayerTimeDTO);
        prayerTimeDTO.setPrayerId(prayerTime.getPrayer().getId());
        return prayerTimeDTO;
    }

    public PrayerTime fromPrayerTimeDTO(PrayerTimeDTO prayerTimeDTO) {
        if(prayerTimeDTO==null) return null;
        PrayerTime prayerTime=new PrayerTime();
        BeanUtils.copyProperties(prayerTimeDTO,prayerTime);
        prayerTime.setPrayer(prayerRepository.findById(prayerTimeDTO.getPrayerId()).orElseThrow());
        return prayerTime;
    }

}


