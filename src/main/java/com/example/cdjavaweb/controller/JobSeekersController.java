package com.example.cdjavaweb.controller;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.service.JobSeekersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class JobSeekersController {

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
