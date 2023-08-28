package com.example.cdjavaweb.controller;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.exception.ResourceNotFoundException;
import com.example.cdjavaweb.repository.JobRepository;
import com.example.cdjavaweb.service.JobSeekersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class jobSeekersController {

    @Autowired
    JobSeekersService jobSeekersService;

    @GetMapping
    public List<Job> getAllJob() {
        return jobSeekersService.getAllJob();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobSeekersService.getJobById(id);
    }
}
