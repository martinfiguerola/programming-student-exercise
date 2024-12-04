package com.martin.programming_student_exercise.controllers;

import com.martin.programming_student_exercise.entities.Topic;
import com.martin.programming_student_exercise.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public Topic findById (@PathVariable Long id) {
        return topicService.findById(id);
    }

    @PutMapping("/update")
    public Topic update (@RequestBody Topic topic) {
        return topicService.update(topic);
    }

    @GetMapping
    public List<Topic> findAll () {
        return topicService.findAll();
    }

}
