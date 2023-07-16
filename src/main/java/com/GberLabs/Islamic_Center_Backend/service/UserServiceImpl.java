package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.UserDTO;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import com.GberLabs.Islamic_Center_Backend.mappers.UserMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl  implements UserService{
    private UserRepository userRepository;
    private UserMapperImpl userMapper;
    @Override
    public List<UserDTO> allUsers() {
        List<User> users=userRepository.findAll();
        return users.stream().map(u->userMapper.fromUser(u)).collect(Collectors.toList());
    }
}
