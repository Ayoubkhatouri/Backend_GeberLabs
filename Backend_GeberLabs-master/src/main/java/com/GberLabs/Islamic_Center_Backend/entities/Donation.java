package com.GberLabs.Islamic_Center_Backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Donation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String donatorName;
    private double amount;
    private Date donatedAt;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Center center;
}
