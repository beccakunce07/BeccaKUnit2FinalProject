package com.launchcode2026.BeccaKUnit2FinalProject.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //this needs to be a FK for the user id and then a separate id for the time submitted? im confusing myself
    private String topicId; //these are connected from check in page buttons
    private String feelingId; //these are connected from check in page buttons
    private LocalDate recordedAt;


    public CheckIn(){

    }

    // how do I set the id to the date/time the form is submitted?
    //how do i connect the buttons from my app to have those be the foreign keys(?) for the check in data