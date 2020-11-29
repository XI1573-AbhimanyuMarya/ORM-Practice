package com.practice.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@JsonIgnoreProperties(value = {"employeeLearningPaths"})
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeLearningPath> employeeLearningPaths;
}
