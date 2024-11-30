package com.martin.programming_student_exercise.repositories;

import com.martin.programming_student_exercise.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
