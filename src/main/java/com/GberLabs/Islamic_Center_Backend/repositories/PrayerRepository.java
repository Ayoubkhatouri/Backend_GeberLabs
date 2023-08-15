package com.GberLabs.Islamic_Center_Backend.repositories;

import com.GberLabs.Islamic_Center_Backend.entities.Prayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrayerRepository extends JpaRepository<Prayer,Long> {
}
