package com.martin.programming_student_exercise.controllers;

import com.martin.programming_student_exercise.entities.Course;
import com.martin.programming_student_exercise.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> findAll () {
        return courseService.findAll();
    }

    @GetMapping("/find")
    public List<Course> findByName (@RequestParam String name) {
        return courseService.findByName(name);
    }

    @PostMapping
    public void save (@RequestBody Course course) {
        System.out.println("Course created!!");
    }




}
