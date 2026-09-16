package com.launchcode2026.BeccaKUnit2FinalProject.controllers;

import com.launchcode2026.BeccaKUnit2FinalProject.repositories.*;
import com.launchcode2026.BeccaKUnit2FinalProject.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.Data;

import java.util.List;
import java.util.Optional;

/**
 * */
@RestController
@RequestMapping("love-bomb")
public class LoveBombController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private LoveBombRepository loveBombRepository;

    @Autowired
    private CheckInRepository checkInRepository;

    @GetMapping("find-all")
    public List<LoveBomb> getAll(){
        return loveBombRepository.findAll();
    }
}