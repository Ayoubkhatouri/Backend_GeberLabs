package com.GberLabs.Islamic_Center_Backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Center {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Description;
    private String address ;
    @OneToOne
    private User user;



    @OneToMany(mappedBy = "center")
    private List<Donation> donations=new ArrayList<>();

    @OneToOne(mappedBy = "center")
    private Theme theme;


}
