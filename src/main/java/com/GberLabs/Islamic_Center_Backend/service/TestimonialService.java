package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.TestimonialDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.EventEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.TestimonialEditRequest;

public interface TestimonialService {
    TestimonialDTO saveTestimonial(TestimonialDTO testimonialDTO);
    TestimonialDTO getTestimonial(Long id);
    TestimonialDTO editTestimonial(Long id , TestimonialEditRequest testimonialEditRequest);
    void deleteTestimonial(Long id);
}
