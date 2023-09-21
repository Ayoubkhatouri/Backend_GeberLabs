package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrayerTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fajr;
    private String shuruq;
    private String zohar;
    private String asar;
    private String maghrib;
    private String isha;
    private String day;
    private String month;
    private String year;
    @OneToOne
    private Prayer prayer;

}
