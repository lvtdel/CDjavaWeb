package com.example.cdjavaweb.repository;

import com.example.cdjavaweb.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    public List<Job> findJobsByTitle(String title);

    public List<Job> findJobsByCompanyNameContaining(String companyName);
}
