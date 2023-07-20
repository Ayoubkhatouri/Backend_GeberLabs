package com.GberLabs.Islamic_Center_Backend.web;

import com.GberLabs.Islamic_Center_Backend.dtos.HeaderFooterDTO;
import com.GberLabs.Islamic_Center_Backend.service.HeaderFooterService;
import jakarta.mail.Header;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/headerFooter")
@RequiredArgsConstructor
@CrossOrigin
public class HeaderFooterController {
    private final HeaderFooterService headerFooterService;
    @PostMapping("/admin/create")
    public HeaderFooterDTO createHeaderFooter(@RequestBody HeaderFooterDTO headerFooterDTO){
        return headerFooterService.saveHeaderFooter(headerFooterDTO);
    }

    @GetMapping("/admin/getHeaderFooter/{id}")
    public HeaderFooterDTO getHeaderFooter(@PathVariable Long id){
        return headerFooterService.getHeaderFooter(id);
    }
}
