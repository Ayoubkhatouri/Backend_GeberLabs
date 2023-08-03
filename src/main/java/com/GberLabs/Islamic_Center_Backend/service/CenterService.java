package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.CenterEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Center;

import java.util.List;

public interface CenterService {
    CenterDTO saveCenter(CenterDTO centerDTO);
    List<CenterDTO> getAllCenters();
    CenterDTO getCenter(Long id);
    CenterDTO editCenter(Long id, CenterEditRequest centerEditRequest);
    void deleteCenter(Long id);
}
