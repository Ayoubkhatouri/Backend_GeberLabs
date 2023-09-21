package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class AboutUsDTO {
    private Long id;
    private String title;
    private String paragraph;
    private Long homePageId;
}
