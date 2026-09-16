package com.launchcode2026.BeccaKUnit2FinalProject.repositories;

import com.launchcode2026.BeccaKUnit2FinalProject.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository <UserInfo, Long> {
}
