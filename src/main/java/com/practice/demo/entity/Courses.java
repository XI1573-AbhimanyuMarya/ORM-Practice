package com.practice.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@JsonIgnoreProperties(value = {"learningPath"})
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "C_ID")
    private Long id;
    @Column(name = "C_NAME")
    private String name;
    @Column(name = "C_DESCRIPTION")
    private String description;

    @ManyToMany(mappedBy = "courses")
    private List<LearningPath> learningPaths;
}
