package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class HeaderFooterDTO {
    private Long id;
    private String headerColor;
    private String footerColor;
    private String footerPhoneNumber;
    private String footerEmail;
    private Long centerId;
}
