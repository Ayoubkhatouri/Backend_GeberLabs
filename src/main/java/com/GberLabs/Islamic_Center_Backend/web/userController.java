package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationResponse;
import com.GberLabs.Islamic_Center_Backend.auth.RegisterRequest;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import com.GberLabs.Islamic_Center_Backend.service.AuthenticationService;
import com.GberLabs.Islamic_Center_Backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin
public class userController {
    private final UserService userService;

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.allUsers();
    }
}
