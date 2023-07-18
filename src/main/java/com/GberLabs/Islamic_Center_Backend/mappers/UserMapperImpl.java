package com.GberLabs.Islamic_Center_Backend.mappers;


import com.GberLabs.Islamic_Center_Backend.dtos.UserDTO;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMapperImpl {
    private final CenterMapperImpl centerMapper;
    public UserDTO fromUser(User user){
        if(user==null) return null;
        UserDTO userDTO=new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        userDTO.setCenterDTO(centerMapper.fromCenter(user.getCenter()));

        return userDTO;
    }
    public  User fromUserDTO(UserDTO userDTO){
        if(userDTO==null) return null;
        User user=new User();
        BeanUtils.copyProperties(userDTO,user);
        user.setCenter(centerMapper.fromCenterDTo(userDTO.getCenterDTO()));
        return user;
    }
}
