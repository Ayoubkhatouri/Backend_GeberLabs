package com.GberLabs.Islamic_Center_Backend.repositories;

import com.GberLabs.Islamic_Center_Backend.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {

}
