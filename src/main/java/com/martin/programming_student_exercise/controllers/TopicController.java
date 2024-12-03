package com.martin.programming_student_exercise.controllers;

import com.martin.programming_student_exercise.entities.Topic;
import com.martin.programming_student_exercise.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @PostMapping("/create")
    public String create (@RequestBody Topic topic) {
        topicService.save(topic);
        return "Topic created!";
    }
}
