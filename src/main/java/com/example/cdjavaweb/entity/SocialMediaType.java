package com.example.cdjavaweb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "social_media_type")
public class SocialMediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
