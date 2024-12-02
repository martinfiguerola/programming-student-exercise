package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.entities.Course;

import java.util.List;

public interface CourseService {
    void save (Course course);
    Course findById (Long id);
    List<Course> findAll ();
    void deleteById (Long id);
    List<Course> findByName (String name);


}
