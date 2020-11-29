package com.practice.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.demo.enums.Level;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class LearningPath {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LP_ID")
    private Long id;

    @Column(name = "LP_NAME")
    private String name;

    @Column(name = "LP_DESCRIPTION")
    private String description;

    @Column(name = "DIFFICULTY_LEVEL")
    @Enumerated(EnumType.STRING)
    private Level level;

    @ManyToMany
    @JoinTable(name = "LearningPathCourses",joinColumns = @JoinColumn(name = "LearningPathId"), inverseJoinColumns = @JoinColumn(name = "CoursesId"))
    private List<Courses> courses;

    @OneToMany(mappedBy = "learningPath", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<EmployeeLearningPath> employeeLearningPaths;

}
