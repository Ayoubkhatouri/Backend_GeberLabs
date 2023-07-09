package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor
public class Theme {
    @Id @GeneratedValue
    private Long id;

    @OneToOne
    private Center center;
}
