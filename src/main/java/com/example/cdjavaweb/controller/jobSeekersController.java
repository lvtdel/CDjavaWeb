package com.example.cdjavaweb.controller;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.exception.ResourceNotFoundException;
import com.example.cdjavaweb.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobSeekersController {

    @Autowired
    JobRepository jobRepository;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job not found with id " + id)
        );
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job jobDetails) {
        Job job = jobRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Job not found with id" + id)
                );
        job.setCareer(jobDetails.getCareer());
        job.setTitle(jobDetails.getTitle());
        job.setPosition(jobDetails.getPosition());
        job.setCompanyName(jobDetails.getCompanyName());
        job.setDescription(jobDetails.getDescription());
        job.setAddressID(jobDetails.getAddressID());
        job.setMinSalary(jobDetails.getMinSalary());
        job.setMaxSalary(jobDetails.getMaxSalary());

        return jobRepository.save(job);
    }

    @DeleteMapping
    public ResponseEntity deleteJob(@PathVariable Long id) {
        jobRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteJob(@PathVariable Long id) {
//        Job job = jobRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Job not found with id " + id));
//        jobRepository.delete(job);
//        return ResponseEntity.ok().build();
//    }
}
