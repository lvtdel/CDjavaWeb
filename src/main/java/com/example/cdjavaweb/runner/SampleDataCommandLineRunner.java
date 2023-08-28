package com.example.cdjavaweb.runner;

import com.example.cdjavaweb.entity.*;
import com.example.cdjavaweb.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Component
public class SampleDataCommandLineRunner implements CommandLineRunner {
    private final JobRepository jobRepository;
    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final SocialMediaRepository socialMediaRepository;
    private final SocialMediaTypeRepository socialMediaTypeRepository;
    private final CVRepository cvRepository;
    private final JobRequirementsRepository jobRequirementsRepository;

    public SampleDataCommandLineRunner(JobRepository jobRepository,
                                       UserRepository userRepository,
                                       AddressRepository addressRepository,
                                       SocialMediaRepository socialMediaRepository,
                                       SocialMediaTypeRepository socialMediaTypeRepository,
                                       CVRepository cvRepository,
                                       JobRequirementsRepository jobRequirementsRepository, JobRequirementsRepository jobRequirementsRepository1) {
        this.jobRepository = jobRepository;
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.socialMediaRepository = socialMediaRepository;
        this.socialMediaTypeRepository = socialMediaTypeRepository;
        this.cvRepository = cvRepository;
        this.jobRequirementsRepository = jobRequirementsRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        User user1 = new User(1L, "johndoe", "password123", "John Doe", "johndoe@example.com", "(123) 456-7890");
        userRepository.save(user1);
        User user2 = new User(2L, "janedoe", "password456", "Jane Doe", "janedoe@example.com", "(123) 456-7890");
        userRepository.save(user2);

        Address address1 = new Address(1,"Hà Nội", "Ba Đình", "Điện Biên", "144 Xuân Thủy");
        addressRepository.save(address1);
        Address address2 = new Address(2, "Hồ Chí Minh", "Quận 1", "Phường Tân Định", "123 Nguyễn Văn Linh");
        addressRepository.save(address2);

        Job job1 = new Job(1, "IT", "Software Engineer", "Junior", "XYZ Company", "We are seeking...", 1L,
                50000, 80000, new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2023-09-01").getTime()), Date.valueOf("2023-12-31"), "jobs@xyzcompany.com", "(123) 456-7890", 1, null);
        jobRepository.save(job1);
        Job job2 = new Job(2, "Marketing", "Content Writer", "Entry-level", "ABC Inc.", "We are looking for...", 2L,
                40000, 60000, new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2023-09-01").getTime()), Date.valueOf("2023-12-31"), "jobs@abcinc.com", "(123) 456-7890", 2, null);
        jobRepository.save(job2);
        Job job3 = new Job(3, "IT", "Web Developer", "Senior", "DEF Company", "", 3L,
                80000, 120000, new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2023-09-01").getTime()), Date.valueOf("2023-12-25"), "jobs@defcompany.com", "(123) 456-7890", 1, null);
        jobRepository.save(job3);

        SocialMediaType facebook = new SocialMediaType(1, "Facebook");
        socialMediaTypeRepository.save(facebook);
        SocialMediaType twitter = new SocialMediaType(2, "Twitter");
        socialMediaTypeRepository.save(twitter);
        SocialMediaType instagram = new SocialMediaType(3, "Instagram");
        socialMediaTypeRepository.save(instagram);

        SocialMedia socialMedia = new SocialMedia(1L, "https://www.facebook.com/johndoe/", 1L, 1L);
        socialMediaRepository.save(socialMedia);
        SocialMedia socialMedia2 = new SocialMedia(2L, "https://twitter.com/johndoe/", 2L, 2L);
        socialMediaRepository.save(socialMedia2);

        CV cv = new CV(1L, "/path/to/cv.pdf", 1L);
        cvRepository.save(cv);
        CV cv2 = new CV(2L, "/path/to/cv-janedoe.pdf", 2L);
        cvRepository.save(cv2);

        JobRequirements jobReq1 = new JobRequirements(1, "Strong coding skills in Java and Python", job1);
        jobRequirementsRepository.save(jobReq1);
        JobRequirements jobReq2 = new JobRequirements(2, "Excellent communication skills", job2);
        jobRequirementsRepository.save(jobReq2);

    }
}

