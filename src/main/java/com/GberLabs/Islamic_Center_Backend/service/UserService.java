package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.UserDTO;
import com.GberLabs.Islamic_Center_Backend.entities.User;

import java.util.List;

public interface UserService {
    List<UserDTO> allUsers();
}
