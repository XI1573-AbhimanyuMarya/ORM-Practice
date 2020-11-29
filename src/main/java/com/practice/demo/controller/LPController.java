package com.practice.demo.controller;

import com.practice.demo.entity.LearningPath;
import com.practice.demo.repository.LearningPathRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LPController {

    @Autowired
    protected LearningPathRepo learningPathRepo;

    @PostMapping("/save")
    public ResponseEntity<LearningPath> saveData(@RequestBody LearningPath learningPath){

        LearningPath learningPath1 = learningPathRepo.saveAndFlush(learningPath);
        return ResponseEntity.ok(learningPath1);

    }

}
