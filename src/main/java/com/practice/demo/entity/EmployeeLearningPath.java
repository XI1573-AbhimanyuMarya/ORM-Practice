package com.practice.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.practice.demo.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@JsonIgnoreProperties(value = {"learningPath"})

public class EmployeeLearningPath {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Users employee;

    @ManyToOne
    @JoinColumn(name = "LP_ID")
    @JsonBackReference
    private LearningPath learningPath;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private byte[] certificate;


}
