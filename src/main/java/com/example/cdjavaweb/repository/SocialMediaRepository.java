package com.example.cdjavaweb.repository;

import com.example.cdjavaweb.entity.Address;
import com.example.cdjavaweb.entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {
}
