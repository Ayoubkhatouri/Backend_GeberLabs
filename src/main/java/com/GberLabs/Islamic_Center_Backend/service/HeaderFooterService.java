package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.HeaderFooterDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.HeaderFooterEditRequest;

public interface HeaderFooterService {

    HeaderFooterDTO saveHeaderFooter(HeaderFooterDTO headerFooterDTO);
    HeaderFooterDTO getHeaderFooter(Long id);
    HeaderFooterDTO editHeaderFooter(Long id , HeaderFooterEditRequest headerFooterEditRequest);
}
