package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.TestimonialDTO;
import com.GberLabs.Islamic_Center_Backend.entities.Testimonial;
import com.GberLabs.Islamic_Center_Backend.repositories.HomePageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestimonialMapperImpl {

    private final HomePageRepository homePageRepository;


    public TestimonialDTO fromTestimonial(Testimonial  testimonial){
        if(testimonial==null)
            return null;
        TestimonialDTO testimonialDTO=new TestimonialDTO();
        BeanUtils.copyProperties(testimonial,testimonialDTO);
        testimonialDTO.setHomePageId(testimonial.getHomePage().getId());
        return testimonialDTO;
    }

    public Testimonial fromTestimonialDTO(TestimonialDTO testimonialDTO){
        if(testimonialDTO==null)
            return null;
        Testimonial testimonial=new Testimonial();
        BeanUtils.copyProperties(testimonialDTO,testimonial);
        testimonial.setHomePage(homePageRepository.findById(testimonialDTO.getHomePageId()).orElseThrow());
        return testimonial;
    }
}
