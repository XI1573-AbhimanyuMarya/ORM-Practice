package com.practice.demo.repository;

import com.practice.demo.entity.LearningPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningPathRepo extends JpaRepository<LearningPath, Long> {
}
