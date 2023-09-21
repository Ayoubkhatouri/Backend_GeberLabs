package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class Theme {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titleColor;
    private String textColor;
    private String backgroundColor;
    private String primaryColor;
    @OneToOne
    private Center center;
}
