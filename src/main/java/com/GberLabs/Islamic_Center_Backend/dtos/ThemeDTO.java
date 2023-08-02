package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class ThemeDTO {
    private Long id;
    private String titleColor;
    private String textColor;
    private String backgroundColor;
    private String primaryColor;
    private Long centerId;
}
