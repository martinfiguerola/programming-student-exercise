package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.entities.Course;
import com.martin.programming_student_exercise.entities.Topic;

import java.util.List;

public interface TopicService {

    void save (Topic topic);
    Topic findById (Long id);
    List<Topic> findAll ();
    void deleteById (Long id);
    List<Topic> findByName (String name);
    Topic update (Topic topic);

}
