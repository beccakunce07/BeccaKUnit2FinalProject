package com.launchcode2026.BeccaKUnit2FinalProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
    private String location;
    private LocalDate birthday;
}

public User () {
}

public User (String first_name, String last_name, String username, String email, String password, String location, LocalDate birthday) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.username = username;
    this.email = email;
    this.password = password;
    this.location = location;
    this.birthday = birthday;
}
