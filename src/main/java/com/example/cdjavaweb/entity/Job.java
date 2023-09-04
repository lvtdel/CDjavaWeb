package com.example.cdjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
// Để Json xác định đối tượng, tránh lặp vô tận khi truy cập các đối tượng lồng nhau
// VD job->jobRqm->job...
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String career;
    @Column(columnDefinition = "TEXT")
    private String title;
    private String position;
    @Column(name = "company_name")
    private String companyName;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(name = "address_id")
    private long addressID;
    @Column(name = "min_salary")
    private double minSalary;
    @Column(name = "max_salary")
    private double maxSalary;
    @CreationTimestamp
    private Timestamp startDate;
    private Date expirationDate;
    private String email;
    private String phoneNumber;
    @Column(name = "user_id")
    private long userID;

    @OneToMany(mappedBy = "job", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<JobRequirements> jobRequirements = new HashSet<JobRequirements>();

//    public Set<JobRequirements> getJobRequirements() {
//        return jobRequirements;
//    }
}
