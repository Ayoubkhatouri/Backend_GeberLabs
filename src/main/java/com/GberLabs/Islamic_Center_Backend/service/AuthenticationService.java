package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationRequest;
import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationResponse;
import com.GberLabs.Islamic_Center_Backend.auth.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);

}
