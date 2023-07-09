package com.GberLabs.Islamic_Center_Backend.web;


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
    public List<User> getAll(){
        return userService.allUsers();
    }
}
