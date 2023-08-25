package com.example.cdjavaweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "social_media_type")
@AllArgsConstructor
@NoArgsConstructor
public class SocialMediaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
