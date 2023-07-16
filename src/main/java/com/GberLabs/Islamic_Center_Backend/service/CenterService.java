package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;

import java.util.List;

public interface CenterService {
    CenterDTO saveCenter(CenterDTO centerDTO);
    List<CenterDTO> getAllCenters();
    CenterDTO getCenter(Long id);
    CenterDTO
    void deleteCenter(Long id);
}
