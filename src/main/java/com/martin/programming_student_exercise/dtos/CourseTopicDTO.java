package com.martin.programming_student_exercise.dtos;

import com.martin.programming_student_exercise.entities.Topic;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CourseTopicDTO {

    private String courseName;
    private List<Topic> topics;


}
