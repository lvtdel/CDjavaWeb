package com.example.cdjavaweb;

import com.example.cdjavaweb.repository.JobRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import static com.example.cdjavaweb.helpers.StringJsonUtils.objectToJson;

@SpringBootTest
class CDjavaWebApplicationTests {

//    @Mock
//    Mock chỉ tạo đối tượng giả lập, chủ yếu để test method hoạt động tốt với các tham số
//    hay không, nó không thể tương tác với DB hay các thành phần khác
    @Autowired
    private JobRepository jobRepository;



    @Test
    void testJobRepository() {

        long count = jobRepository.count();
        Assertions.assertEquals(3L, count);
//        System.out.print(objectToJson(jobRepository.findAll(
//                Sort.by("minSalary", "id").descending()
//        )));
        System.out.print(objectToJson(jobRepository.findJobsByCompanyNameContaining("AB")));


        String title = jobRepository.findJobsByTitle("Software Engineer").get(0).getTitle();
        Assertions.assertEquals("Software Engineer", title);


    }
}
