package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.entities.Topic;
import com.martin.programming_student_exercise.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService{

    @Autowired
    private TopicRepository topicRepository;
    @Override
    public void save(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public Topic findById(Long id) {
        return null;
    }

    @Override
    public List<Topic> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Topic> findByName(String name) {
        return null;
    }

    @Override
    public Topic update(Topic topic) {
        return null;
    }
}
