package com.example.cdjavaweb.service;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobRecruiterService {

    @Autowired
    JobRepository jobRepository;

    public Job create(Job job) {
        return jobRepository.save(job);
    }
}
