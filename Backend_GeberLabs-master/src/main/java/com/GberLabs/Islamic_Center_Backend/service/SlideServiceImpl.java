package com.GberLabs.Islamic_Center_Backend.service;


import com.GberLabs.Islamic_Center_Backend.dtos.SlideDTO;
import com.GberLabs.Islamic_Center_Backend.editRequest.SlideEditRequest;
import com.GberLabs.Islamic_Center_Backend.entities.Slide;
import com.GberLabs.Islamic_Center_Backend.mappers.SlideMapperImpl;
import com.GberLabs.Islamic_Center_Backend.repositories.SlideRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SlideServiceImpl implements  SlideSerive{

    private SlideMapperImpl slideMapper;
    private SlideRepository slideRepository;

    @Override
    public SlideDTO saveSlide(SlideDTO slideDTO) {
        Slide slide=slideMapper.fromSlideDTO(slideDTO);
        Slide savedSlide=slideRepository.save(slide);
        return slideMapper.fromSlide(savedSlide);
    }

    @Override
    public SlideDTO getSlide(Long id) {
        return slideMapper.fromSlide(slideRepository.findById(id).orElseThrow());
    }

    @Override
    public SlideDTO editSlide(Long id, SlideEditRequest slideEditRequest) {
        Slide slide=slideRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(slideEditRequest,slide);
        Slide savedSlide=slideRepository.save(slide);
        return slideMapper.fromSlide(savedSlide);
    }

    @Override
    public void deleteSlide(Long id) {
        Slide slide=slideRepository.findById(id).orElseThrow();
        slideRepository.delete(slide);
    }
}
