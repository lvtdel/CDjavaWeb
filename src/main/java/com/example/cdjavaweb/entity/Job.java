package com.example.cdjavaweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private int addressID;
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
    private int userID;

}
