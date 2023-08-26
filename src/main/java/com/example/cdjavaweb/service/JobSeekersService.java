package com.example.cdjavaweb.service;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.exception.ResourceNotFoundException;
import com.example.cdjavaweb.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekersService {
    @Autowired
    JobRepository jobRepository;

    public List<Job> getAllJob() {
        return jobRepository.findAll();
    }

    public Job getJobById(long id) {
        return jobRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job not found with id " + id)
        );
    }

    public List<Job> findAllJobsByCompanyName(String companyName) {
        return jobRepository.findJobsByCompanyNameContaining(companyName);
    }

}
