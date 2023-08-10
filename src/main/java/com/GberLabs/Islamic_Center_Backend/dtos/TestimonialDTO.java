package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class TestimonialDTO {
    private Long id;
    private String userName;
    private String comment;
    private String image;
    private Long homePageId;
}
