package com.martin.programming_student_exercise.repositories;

import com.martin.programming_student_exercise.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // SELECT * FROM courses WHERE name LIKE '%?1%' ->  and ignoreCase
    List<Course> findByNameContainingIgnoreCase (String name);

}
