package com.launchcode2026.BeccaKUnit2FinalProject.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "self_love_bombs")
@Data
public class LoveBomb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private String category;

}
