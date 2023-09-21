package com.GberLabs.Islamic_Center_Backend.editRequest;

import lombok.Data;

@Data
public class PrayerTimeEditRequest {
    private String fajr;
    private String shuruq;
    private String zohar;
    private String asar;
    private String maghrib;
    private String isha;
    private String day;
    private String month;
    private String year;
}
