package com.example.cdjavaweb.service;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.helpers.StringJsonUtils;
import com.example.cdjavaweb.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobRecruiterService {

    @Autowired
    JobRepository jobRepository;

    public Job create(Job job) {
//        System.out.println(StringJsonUtils.objectToJson(
//                job
//        ));

        job.setId(0);
        job.getJobRequirements().forEach(jobRequirements -> {
            jobRequirements.setId(0);
            jobRequirements.setJob(job);
        });
//        System.out.println(StringJsonUtils.objectToJson(
//                job
//        ));

        return jobRepository.save(job);
    }

    public List<Job> findAll() {
        return jobRepository.findAll();
    }
}
