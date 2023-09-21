package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class PrayerDTO {
    private Long id;
    private String country;
    private String city;
    private String state;
    private double highLatitude;
    private double prayer;
    private double asar;
    private Long homePageId;
}
