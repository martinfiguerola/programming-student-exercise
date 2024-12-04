package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.entities.Topic;

import java.util.List;

public interface TopicService {

    void save (Topic topic);
    List<Topic> findAll ();
    Topic findById (Long id);
    Topic update (Topic topic);


}
