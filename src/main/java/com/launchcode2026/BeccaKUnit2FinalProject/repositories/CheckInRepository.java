package com.launchcode2026.BeccaKUnit2FinalProject.repositories;

import com.launchcode2026.BeccaKUnit2FinalProject.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends JpaRepository <UserInfo, Long> {
}
