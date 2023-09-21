package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.PrayerTimeDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerTimeEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import com.GberLabs.Islamic_Center_Backend.entities.PrayerTime;
import com.GberLabs.Islamic_Center_Backend.mappers.PrayerTimeMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.PrayerRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.PrayerTimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrayerTimeServiceImpl implements PrayerTimeService{
    private PrayerTimeRepository prayerTimeRepository;
    private PrayerTimeMapperImpl prayerTimeMapper;
    private PrayerRepository prayerRepository;
    @Override
    public PrayerTimeDTO savePrayerTime(PrayerTimeDTO prayerTimeDTO) {
        Prayer prayer=prayerRepository.findById(prayerTimeDTO.getPrayerId()).orElseThrow();
        if(prayer.getPrayerTime()!=null)
            return prayerTimeMapper.fromPrayerTime(prayer.getPrayerTime());
        PrayerTime prayerTime=prayerTimeMapper.fromPrayerTimeDTO(prayerTimeDTO);
        prayer.setPrayerTime(prayerTime);
        prayerRepository.save(prayer);
        PrayerTime savedPrayerTime=prayerTimeRepository.save(prayerTime);
        return prayerTimeMapper.fromPrayerTime(savedPrayerTime);
    }

    @Override
    public PrayerTimeDTO getPrayerTime(Long id) {
        return prayerTimeMapper.fromPrayerTime(prayerTimeRepository.findById(id).orElseThrow());
    }

    @Override
    public PrayerTimeDTO editPrayerTime(Long id, PrayerTimeEditRequest prayerTimeEditRequest) {
        PrayerTime prayerTime=prayerTimeRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(prayerTimeEditRequest,prayerTime);
        PrayerTime savedPrayerTime=prayerTimeRepository.save(prayerTime);
        return prayerTimeMapper.fromPrayerTime(savedPrayerTime);
    }

    @Override
    public void deletePrayerTime(Long id) {
        PrayerTime prayerTime=prayerTimeRepository.findById(id).orElseThrow();
        prayerTimeRepository.delete(prayerTime);
    }
}
