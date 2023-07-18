package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

@Data
public class ServiceDTO {
    private Long id;
    private String name;
    private String description;
    private Long homPageId;
}
