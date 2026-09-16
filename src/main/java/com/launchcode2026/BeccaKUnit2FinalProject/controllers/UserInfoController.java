package com.launchcode2026.BeccaKUnit2FinalProject.controllers;

import com.launchcode2026.BeccaKUnit2FinalProject.repositories.*;
import com.launchcode2026.BeccaKUnit2FinalProject.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

/**
 * */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Autowired
    private LoveBombRepository loveBombRepository;

    @Autowired
    private CheckInRepository checkInRepository;

    @GetMapping("/user-info-form")
    public String userInfoForm(){
        return "<form method='POST', action = '/form'>" +
                "<label>Enter your email: "+
                "<input type = 'text' email = email>" +
                "<label>Enter your first name: "+
                "<input type = 'text' firstName = firstName>" +
                "<label>Enter your last name: "+
                "<input type = 'text' lastName = lastName>" +
                "<label>Enter your desired username: "+
                "<input type = 'text' username = username>" +
                "<label>Enter password: </label> +<input type='password' name='password'><br>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>";
    }

    @PostMapping("form")
    public String handleUserInfoForm(UserInfo userInfo){
        System.out.println(userInfo);
        userInfoRepository.save(userInfo);


    }

}




