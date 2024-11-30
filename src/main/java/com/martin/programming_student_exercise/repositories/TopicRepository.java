package com.martin.programming_student_exercise.repositories;

import com.martin.programming_student_exercise.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
