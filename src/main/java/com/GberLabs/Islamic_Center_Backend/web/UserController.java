package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.UserDTO;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import com.GberLabs.Islamic_Center_Backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;

    @GetMapping("/getAll")
    public List<UserDTO> getAll(){
        return userService.allUsers();
    }

    @PostMapping("/fromUserToAdmin/{id}")
    public UserDTO toAdmin(@PathVariable Long id){
        return  userService.userToAdmin(id);
    }
}
