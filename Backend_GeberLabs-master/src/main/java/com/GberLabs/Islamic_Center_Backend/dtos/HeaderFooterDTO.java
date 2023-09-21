package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class HeaderFooterDTO {
    private Long id;
    private String headerBGColor;
    private String headerTextColor ;
    private boolean headerAboutUs;
    private boolean headerOurServices ;
    private boolean headerOurEvents;
    private boolean headerPrayerTime;
    private boolean headerTestimonials;
    private boolean headerContanctUs;
    private String largeLogo;
    private String smallLogo;
    private String footerBGColor;
    private String footerTextColor ;
    private String footerFacebook;
    private String footerInsta;
    private String footerTwitter;
    private String footerThreads;
    private String footerEmail;
    private String footerPhoneNumber;
    private String footerAddress;
    private String footerwtp;
    private Long centerId;
}
