package com.GberLabs.Islamic_Center_Backend.editRequest;

import lombok.Data;

@Data
public class PrayerEditRequest {
    private String country;
    private String city;
    private String state;
    private double highLatitude;
    private double prayer;
    private double asar;
}
