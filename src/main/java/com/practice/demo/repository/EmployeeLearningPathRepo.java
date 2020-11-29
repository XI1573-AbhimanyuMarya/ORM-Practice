package com.practice.demo.repository;

import com.practice.demo.entity.EmployeeLearningPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLearningPathRepo extends JpaRepository<EmployeeLearningPath, Long> {
}
