package com.GberLabs.Islamic_Center_Backend.auth;


import com.GberLabs.Islamic_Center_Backend.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String tele;
    private String ville;
    private String adresse;
    private Role role;
    private String token;
}
