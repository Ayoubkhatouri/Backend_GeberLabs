package com.GberLabs.Islamic_Center_Backend.editRequest;

import lombok.Data;

@Data
public class DonationInfoEditRequest {
    private String donationReason;
    private String encouragingText;
    private double dollarsAmount;
    private String donationImage;
    private double firstAmount;
    private double secondAmount;
    private double thirdAmount;
    private double fourthAmount;
    private double fifthAmount;
}
