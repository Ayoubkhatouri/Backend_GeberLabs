package com.GberLabs.Islamic_Center_Backend.dtos;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class CenterDTO {
    private  Long id;
    private String name;
    private String Description;
    private String address;
    private Long ownerId;
    private List<DonationDTO> donationDTOList=new ArrayList<>();
    private ThemeDTO themeDTO;
    private HeaderFooterDTO headerFooterDTO;
    private HomePageDTO homePageDTO;
}
