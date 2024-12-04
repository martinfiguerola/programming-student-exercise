package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.dtos.CourseTopicDTO;
import com.martin.programming_student_exercise.entities.Course;
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
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public Topic findById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    @Override
    public Topic update(Topic topic) {

        Topic topicDb = this.findById(topic.getId());

        topicDb.setName(topic.getName());
        topicDb.setDescription(topic.getDescription());
        topicDb.setCourse(topic.getCourse());

        topicRepository.save(topicDb);
        return topicDb;

    }
}
