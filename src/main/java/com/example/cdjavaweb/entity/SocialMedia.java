package com.example.cdjavaweb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "social_media")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String link;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "social_media_type_id")
    private Long socialMediaTypeId;

    // Constructors, getters and setters
}
