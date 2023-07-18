package com.GberLabs.Islamic_Center_Backend.dtos;


import lombok.Data;

import java.util.Date;

@Data
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private Date startAt;
    private Date endAt;
    private Long homPageId;
}
