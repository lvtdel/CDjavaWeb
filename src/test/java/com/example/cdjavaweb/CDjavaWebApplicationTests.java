package com.example.cdjavaweb;

import com.example.cdjavaweb.entity.Job;
import com.example.cdjavaweb.entity.JobRequirements;
import com.example.cdjavaweb.repository.JobRepository;
import com.example.cdjavaweb.repository.JobRequirementsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import static com.example.cdjavaweb.helpers.StringJsonUtils.objectToJson;

@SpringBootTest
class CDjavaWebApplicationTests {

//    @Mock
//    Mock chỉ tạo đối tượng giả lập, chủ yếu để test method hoạt động tốt với các tham số
//    hay không, nó không thể tương tác với DB hay các thành phần khác
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private JobRequirementsRepository jobRequirementsRepository;


    @Test
    void testJobRepository() throws ParseException {

        long count = jobRepository.count();
//        Assertions.assertEquals(3L, count);
//        System.out.print(objectToJson(jobRepository.findAll(
//                Sort.by("minSalary", "id").descending()
//        )));

//        Tương tác DB khi người tuyển dụng đăng tuyển
//        Job newJob = new Job(0, "IT", "Software Engineer", "Junior", "XYZ Company", "We are seeking...", 1L,
//                50000, 80000, new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2023-09-01").getTime()),
//                Date.valueOf("2023-12-31"), "jobs@xyzcompany.com",
//                "(123) 456-7890", 1,
//                null);
//        jobRepository.save(newJob);
//
//        JobRequirements jobReq = new JobRequirements(0, "Strong coding skills in Java and Python", newJob);
//        JobRequirements jobReq2 = new JobRequirements(0, "Strong coding skills in Java and Python", newJob);
//        jobRequirementsRepository.saveAll(List.of(jobReq, jobReq2));

        System.out.print(objectToJson(
//                jobRepository.findJobsByCompanyNameContaining("AB")
//                        .get(0)
                jobRepository.findAll()
        ));


        String title = jobRepository.findJobsByTitle("Software Engineer").get(0).getTitle();
        Assertions.assertEquals("Software Engineer", title);
    }

    @Test
    void testJobRqmRepository() {
        System.out.print(objectToJson(
                jobRequirementsRepository.findAll()
                ));
    }
}
