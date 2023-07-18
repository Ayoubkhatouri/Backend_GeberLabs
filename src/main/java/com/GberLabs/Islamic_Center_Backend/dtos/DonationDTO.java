package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class DonationDTO {
    private Long id;
    private String donatorName;
    private double amount;
    private Date donatedAt;
    private Long centerId;
}
