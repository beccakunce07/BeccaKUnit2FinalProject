package com.launchcode2026.BeccaKUnit2FinalProject.repositories;

import com.launchcode2026.BeccaKUnit2FinalProject.models.LoveBomb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoveBombRepository extends JpaRepository <LoveBomb, Long> {
}
