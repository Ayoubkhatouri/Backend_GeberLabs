package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class DonationInfoDTO {
    private Long id;
    private String donationReason;
    private String encouragingText;
    private double dollarsAmount;
    private String donationImage;
    private double firstAmount;
    private double secondAmount;
    private double thirdAmount;
    private double fourthAmount;
    private double fifthAmount;
    private Long centerId;
}
