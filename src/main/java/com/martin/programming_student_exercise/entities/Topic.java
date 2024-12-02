package com.martin.programming_student_exercise.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "topics")
@Getter @Setter
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Topic(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id) && Objects.equals(name, topic.name) && Objects.equals(description, topic.description) && Objects.equals(course, topic.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, course);
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", course=" + course +
                '}';
    }
}
