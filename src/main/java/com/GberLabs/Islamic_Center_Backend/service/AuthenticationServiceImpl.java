package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationRequest;
import com.GberLabs.Islamic_Center_Backend.auth.AuthenticationResponse;
import com.GberLabs.Islamic_Center_Backend.auth.RegisterRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Role;
import com.GberLabs.Islamic_Center_Backend.entities.User;
import com.GberLabs.Islamic_Center_Backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    @Override
     public AuthenticationResponse register(RegisterRequest request) {
        boolean userExists = userRepository
                .findByEmail(request.getEmail())
                .isPresent();
        if (userExists) {
            throw new IllegalStateException("email already taken");
        }
        var user= User.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .tele(request.getTele())
                .ville(request.getVille())
                .adresse(request.getAdresse())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)


                .build();

        userRepository.save(user);
        User u=userRepository.findByEmail(request.getEmail()).orElse(null);

        var jwtToken=jwtService.generateToken(user);

        return AuthenticationResponse.builder()
                .id(u.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .tele(user.getTele())
                .ville(user.getVille())
                .adresse(user.getAdresse())
                .role(user.getRole())
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()
                    )
            );
        }catch (Exception e){
            e.printStackTrace();
        }

        var user=userRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtToken=jwtService.generateToken(user);



        return AuthenticationResponse.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .tele(user.getTele())
                .ville(user.getVille())
                .adresse(user.getAdresse())
                .role(user.getRole())

                .token(jwtToken)
                .build();
    }


}
