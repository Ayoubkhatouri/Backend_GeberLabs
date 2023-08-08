package com.GberLabs.Islamic_Center_Backend.web;


import com.GberLabs.Islamic_Center_Backend.dtos.EventDTO;
import com.GberLabs.Islamic_Center_Backend.dtos.TestimonialDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.EventEditRequest;
import com.GberLabs.Islamic_Center_Backend.editRequest.TestimonialEditRequest;
import com.GberLabs.Islamic_Center_Backend.service.EventService;
import com.GberLabs.Islamic_Center_Backend.service.TestimonialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/testimonial")
@RequiredArgsConstructor
@CrossOrigin
public class TestimonialController {
    private final TestimonialService testimonialService;

    @PostMapping("/user/create")
    public TestimonialDTO createTestimonial(@RequestBody TestimonialDTO testimonialDTO){
        return  testimonialService.saveTestimonial(testimonialDTO);
    }

    @GetMapping("/user/getTestimonial/{id}")
    public TestimonialDTO getTestimonial(@PathVariable Long id){
        return testimonialService.getTestimonial(id);
    }

    @PutMapping("/user/edit/{id}")
    public TestimonialDTO editTestimonial(@PathVariable Long id, @RequestBody TestimonialEditRequest testimonialEditRequest){
        return testimonialService.editTestimonial(id,testimonialEditRequest);
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteTestimonial(@PathVariable Long id){
        testimonialService.deleteTestimonial(id);
    }
}
