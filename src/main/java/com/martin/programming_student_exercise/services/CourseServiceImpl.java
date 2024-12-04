package com.martin.programming_student_exercise.services;

import com.martin.programming_student_exercise.dtos.CourseTopicDTO;
import com.martin.programming_student_exercise.entities.Course;
import com.martin.programming_student_exercise.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void save (Course course) {
        courseRepository.save(course);
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseTopicDTO findAllTopicByCourseId(Long courseId) {
        Course courseFound = this.findById(courseId); // founded

        CourseTopicDTO courseTopicDTO = new CourseTopicDTO();
        courseTopicDTO.setCourseName(courseFound.getName());
        courseTopicDTO.setTopics(courseFound.getTopics());

        System.out.println(courseTopicDTO);

        return courseTopicDTO;
    }

    @Override
    public List<Course> findByName(String name) {
        return courseRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Course update(Course course) {

        Course courseDb = this.findById(course.getId());

        courseDb.setName(course.getName());
        courseDb.setModality(course.getModality());
        courseDb.setEndDate(course.getEndDate());

        courseRepository.save(courseDb);

        return courseDb;
    }
}
