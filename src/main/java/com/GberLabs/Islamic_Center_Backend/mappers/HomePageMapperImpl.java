package com.GberLabs.Islamic_Center_Backend.mappers;

import com.GberLabs.Islamic_Center_Backend.dtos.HomePageDTO;
import com.GberLabs.Islamic_Center_Backend.entities.HomePage;
import com.GberLabs.Islamic_Center_Backend.repositories.CenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HomePageMapperImpl {
    private final ServiceMapperImpl serviceMapper;
    private final EventMapperImpl eventMapper;
    private final SlideMapperImpl slideMapper;
    private final CenterRepository centerRepository;
    private final TestimonialMapperImpl testimonialMapper;
    private final AboutUsMapperImpl aboutUsMapper;

    public HomePageDTO fromHomePage(HomePage homePage){
        if(homePage==null) return null;
        HomePageDTO homePageDTO=new HomePageDTO();
        BeanUtils.copyProperties(homePage,homePageDTO);
        homePageDTO.setCenterId(homePage.getCenter().getId());
        homePageDTO.setServiceDTOList(homePage.getServices().stream().map(s->serviceMapper.fromService(s)).collect(Collectors.toList()));
        homePageDTO.setEventDTOList(homePage.getEvents().stream().map(e->eventMapper.fromEvent(e)).collect(Collectors.toList()));
        homePageDTO.setSlideDTOList(homePage.getSlides().stream().map(s->slideMapper.fromSlide(s)).collect(Collectors.toList()));
        homePageDTO.setTestimonialDTOList(homePage.getTestimonials().stream().map(t->testimonialMapper.fromTestimonial(t)).collect(Collectors.toList()));
        homePageDTO.setAboutUsDTOList(homePage.getAboutUses().stream().map(a->aboutUsMapper.fromAboutUs(a)).collect(Collectors.toList()));
        return homePageDTO;
    }

    public HomePage fromHomePageDTO(HomePageDTO homePageDTO){
        if(homePageDTO==null) return null;
        HomePage homePage=new HomePage();
        BeanUtils.copyProperties(homePageDTO,homePage);
        homePage.setCenter(centerRepository.findById(homePageDTO.getCenterId()).orElseThrow());
        homePage.setServices(homePageDTO.getServiceDTOList().stream().map(s->serviceMapper.fromServiceDTO(s)).collect(Collectors.toList()));
        homePage.setEvents(homePageDTO.getEventDTOList().stream().map(e->eventMapper.fromEventDTO(e)).collect(Collectors.toList()));
        homePage.setSlides(homePageDTO.getSlideDTOList().stream().map(s->slideMapper.fromSlideDTO(s)).collect(Collectors.toList()));
        homePage.setTestimonials(homePageDTO.getTestimonialDTOList().stream().map(t->testimonialMapper.fromTestimonialDTO(t)).collect(Collectors.toList()));
        homePage.setAboutUses(homePageDTO.getAboutUsDTOList().stream().map(a->aboutUsMapper.fromAboutUsDTO(a)).collect(Collectors.toList()));
        return homePage;
    }
}
