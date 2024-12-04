package com.martin.programming_student_exercise.controllers;

import com.martin.programming_student_exercise.dtos.CourseTopicDTO;
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

    @GetMapping("/{id}")
    public Course findById (@PathVariable Long id) {
        return courseService.findById(id);
    }

    @GetMapping("/find")
    public List<Course> findByName (@RequestParam String name) {
        return courseService.findByName(name);
    }

    @PostMapping
    public void create (@RequestBody Course course) {
        courseService.save(course);
        System.out.println("Course created!!");
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id) {
        courseService.deleteById(id);
        return "Course deleted!";
    }

    @PutMapping("/update")
    public Course update (@RequestBody Course course) {
        return courseService.update(course);
    }

    @GetMapping("/topics")
    public CourseTopicDTO findAllTopicsByCourseId (@RequestParam Long course){
        return courseService.findAllTopicByCourseId(course);
    }



}
