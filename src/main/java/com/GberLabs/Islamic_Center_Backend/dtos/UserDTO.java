package com.GberLabs.Islamic_Center_Backend.dtos;

import com.GberLabs.Islamic_Center_Backend.entities.Role;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String firstname;
    private String  lastname;
    private String email;
    private String tele;
    private String ville;
    private String adresse;
    private Role role;
    private CenterDTO centerDTO;

}
