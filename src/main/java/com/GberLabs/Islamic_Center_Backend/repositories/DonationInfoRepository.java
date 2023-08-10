package com.GberLabs.Islamic_Center_Backend.repositories;

import com.GberLabs.Islamic_Center_Backend.entities.DonationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationInfoRepository extends JpaRepository<DonationInfo,Long> {
}
