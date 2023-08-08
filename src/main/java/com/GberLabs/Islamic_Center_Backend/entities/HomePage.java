package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class HomePage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String whoAreWe;
    private String ourVision;
    private String eventBorderColor;
    private String eventBgColor;
    private String eventAdditionalInfoColor;
    private String iconSlidesColor;
    @OneToMany(mappedBy = "homePage")
    private List<Event> events=new ArrayList<>();

    @OneToMany(mappedBy = "homePage")
    private List<Service> services=new ArrayList<>();

    @OneToMany(mappedBy = "homePage")
    private List<Slide> slides=new ArrayList<>();

    @OneToMany(mappedBy = "homePage")
    private List<Testimonial> testimonials=new ArrayList<>();

    @OneToOne
    private Center center;

}
