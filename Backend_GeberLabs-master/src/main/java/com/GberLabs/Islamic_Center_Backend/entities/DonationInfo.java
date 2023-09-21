package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String donationReason;
    private String encouragingText;
    private double dollarsAmount;
    @Column(columnDefinition = "LONGTEXT")
    private String donationImage;
    private double firstAmount;
    private double secondAmount;
    private double thirdAmount;
    private double fourthAmount;
    private double fifthAmount;
    @OneToOne
    private Center center;
}
