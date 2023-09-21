package com.GberLabs.Islamic_Center_Backend.repositories;

import com.GberLabs.Islamic_Center_Backend.entities.PrayerTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrayerTimeRepository extends JpaRepository<PrayerTime,Long> {
}
