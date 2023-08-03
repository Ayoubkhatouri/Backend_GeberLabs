package com.GberLabs.Islamic_Center_Backend.editRequest;

import lombok.Data;

import java.util.Date;

@Data
public class EventEditRequest {
    private String name;
    private String description;
    private String location;
    private Date startAt;
    private Date endAt;
}
