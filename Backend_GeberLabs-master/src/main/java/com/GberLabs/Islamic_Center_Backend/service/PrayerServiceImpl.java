package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.PrayerDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.PrayerEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import com.GberLabs.Islamic_Center_Backend.mappers.PrayerMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.PrayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrayerServiceImpl implements PrayerService{

    private PrayerRepository prayerRepository;
    private PrayerMapperImpl prayerMapper;
    private HomePageRepository homePageRepository;

    @Override
    public PrayerDTO savePrayer(PrayerDTO prayerDTO) {
        HomePage homePage=homePageRepository.findById(prayerDTO.getHomePageId()).orElseThrow();
        if(homePage.getPrayer()!=null)
            return prayerMapper.fromPrayer(homePage.getPrayer());
        Prayer prayer=prayerMapper.fromPrayerDTO(prayerDTO);
        homePage.setPrayer(prayer);
        homePageRepository.save(homePage);
        Prayer savedPrayer=prayerRepository.save(prayer);
        return prayerMapper.fromPrayer(savedPrayer);
    }

    @Override
    public PrayerDTO getPrayer(Long id) {
        return prayerMapper.fromPrayer(prayerRepository.findById(id).orElseThrow());
    }

    @Override
    public PrayerDTO editPrayer(Long id, PrayerEditRequest prayerEditRequest) {
        Prayer prayer=prayerRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(prayerEditRequest,prayer);
        Prayer savedPrayer=prayerRepository.save(prayer);
        return prayerMapper.fromPrayer(savedPrayer);
    }

    @Override
    public void deletePrayer(Long id) {
        Prayer prayer=prayerRepository.findById(id).orElseThrow();
        prayerRepository.delete(prayer);
    }
}
