package com.launchcode2026.BeccaKUnit2FinalProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.Data;

/**
 * */
@RestController
@Data
public class UserController {

    @GetMapping("form")
    public String userForm(){
        return "<form method='post'>" +
                "<label>Enter your first name: "+
                "<input type = 'text' firstName = firstName>" +
                "<label>Enter your last name: "+
                "<input type = 'text' lastName = lastName>" +
                "<label>Enter your desired username: "+
                "<input type = 'text' username = username>" +
                "<label>Enter your email: "+
                "<input type = 'text' email = email>" +
                "<input type = 'submit'>" +
//                CONTINUE TO PUT IN STUFF HERE
                "</form>";
    }

    @PostMapping("form")
    public String handleUserForm(String firstName, String lastName){
        return STR."Hello, \{firstName} \{lastName}";

    }

}




