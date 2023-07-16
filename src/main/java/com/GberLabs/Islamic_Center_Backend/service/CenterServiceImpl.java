package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.CenterDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Center;
import com.GberLabs.Islamic_Center_Backend.entities.Role;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import com.GberLabs.Islamic_Center_Backend.mappers.CenterMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import com.GberLabs.Islamic_Center_Backend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CenterServiceImpl implements CenterService{

    private UserRepository userRepository;
    private CenterRepository centerRepository;
    private CenterMapperImpl centerMapper;

    @Override
    public Center saveCenter(CenterDTO centerDTO) {
        Center center=centerMapper.fromCenterDTo(centerDTO);
        User user=userRepository.findById(centerDTO.getOwnerId()).orElseThrow();
        user.setRole(Role.ADMIN);
        user.setCenter(center);
        userRepository.save(user);
        return centerRepository.save(center);
    }

    @Override
    public List<Center> getAllCenters() {
        return null;
    }

    @Override
    public Center getCenter(Long id) {
        return null;
    }

    @Override
    public void deleteCenter(Long id) {

    }
}
