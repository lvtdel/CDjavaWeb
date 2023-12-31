package com.example.cdjavaweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "social_media")
@AllArgsConstructor
@NoArgsConstructor
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String link;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "social_media_type_id")
    private long socialMediaTypeId;

    // Constructors, getters and setters
}
