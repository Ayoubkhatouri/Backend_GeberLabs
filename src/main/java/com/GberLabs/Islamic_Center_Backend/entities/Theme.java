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
    private String font;
    private String colorLightPrimary;
    private String colorDarkPrimary;
    private String colorSecondary;
    private String colorBodyBackround;
    private String colorSuccess;
    private String colorInfo;
    private String colorWarining;
    private String colorDanger;
    private String logo;
    private String favicon;
    @OneToOne
    private Center center;
}
