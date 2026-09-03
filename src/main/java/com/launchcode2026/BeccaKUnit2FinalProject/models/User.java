package com.launchcode2026.BeccaKUnit2FinalProject.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
    private String type;

    }

    public Potion(int id, String name, int potency, String type) {
        this.id = id;
        this.name = name;
        this.potency = potency;
        this.type = type;
    }
