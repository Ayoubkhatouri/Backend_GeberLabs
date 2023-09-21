package com.GberLabs.Islamic_Center_Backend.service;

import com.GberLabs.Islamic_Center_Backend.dtos.TestimonialDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.TestimonialEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Testimonial;
import com.GberLabs.Islamic_Center_Backend.mappers.TestimonialMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.TestimonialRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestimonialServiceImpl implements TestimonialService{

    private TestimonialMapperImpl testimonialMapper;
    private TestimonialRepository testimonialRepository;

    @Override
    public TestimonialDTO saveTestimonial(TestimonialDTO testimonialDTO) {
        Testimonial testimonial=testimonialMapper.fromTestimonialDTO(testimonialDTO);
        Testimonial savedtestimonial=testimonialRepository.save(testimonial);
        return testimonialMapper.fromTestimonial(savedtestimonial);
    }

    @Override
    public TestimonialDTO getTestimonial(Long id) {
        return testimonialMapper.fromTestimonial(testimonialRepository.findById(id).orElseThrow());
    }

    @Override
    public TestimonialDTO editTestimonial(Long id, TestimonialEditRequest testimonialEditRequest) {
        Testimonial testimonial=testimonialRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(testimonialEditRequest,testimonial);
        Testimonial savedtestimonial=testimonialRepository.save(testimonial);
        return testimonialMapper.fromTestimonial(savedtestimonial);
    }

    @Override
    public void deleteTestimonial(Long id) {
        Testimonial testimonial=testimonialRepository.findById(id).orElseThrow();
        testimonialRepository.delete(testimonial);
    }
}
