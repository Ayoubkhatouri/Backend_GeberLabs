package com.GberLabs.Islamic_Center_Backend.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class HeaderFooter {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String headerColor;
    private String footerColor;
    private String footerPhoneNumber;
    private String footerEmail;
    @OneToOne
    private Center center;
}
