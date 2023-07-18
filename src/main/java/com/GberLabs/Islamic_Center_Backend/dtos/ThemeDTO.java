package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class ThemeDTO {
    private Long id;
    private String font;
    private String colorLightPrimary;
    private String colorDarkPrimary;
    private String colorSecondary;
    private String colorBodyBackround;
    private String colorSuccess;
    private String colorInfo;
    private String colorWarining;
    private String colorDanger;
    private String logo;
    private String favicon;
    private Long centerId;
}
