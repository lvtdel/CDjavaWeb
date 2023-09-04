package com.example.cdjavaweb.controller;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.service.JobRecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruiter")
public class JobRecruiterController {

    @Autowired
    JobRecruiterService jobRecruiterService;
    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRecruiterService.create(job);
    }
    //        Chuẩn dữ liệu JSON mẫu
//        {
//            "id": null,
//                "career": "IT",
//                "title": "Software Engineer",
//                "position": "Junior",
//                "companyName": "XYZ Company",
//                "description": "We are seeking...",
//                "addressID": 1,
//                "minSalary": 40000.0,
//                "maxSalary": 60000.0,
//                "startDate": "2023-08-31T17:00:00.000+00:00",
//                "expirationDate": "2023-12-31",
//                "email": "jobs@xyzcompany.com",
//                "phoneNumber": "(123) 456-7890",
//                "userID": 1,
//                "jobRequirements": [
//            {
//                "id": null,
//                    "content": "Strong coding skills in Java and Python",
//                    "job": null
//            },
//            {
//                "id": null,
//                    "content": "Strong coding skills in Java and Python",
//                    "job": null
//            }
//    ]
//        }

    @GetMapping
    public List<Job> myJobs() {
        return jobRecruiterService.findAll();
    }
}


