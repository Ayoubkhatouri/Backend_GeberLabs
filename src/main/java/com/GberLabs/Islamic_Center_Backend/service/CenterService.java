package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;

import java.util.List;

public interface CenterService {
    Center saveCenter(CenterDTO centerDTO);
    List<Center> getAllCenters();
    Center getCenter(Long id);
    void deleteCenter(Long id);
}
