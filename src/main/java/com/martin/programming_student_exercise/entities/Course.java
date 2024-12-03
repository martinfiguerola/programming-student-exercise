package com.martin.programming_student_exercise.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "courses")
@Getter @Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String modality;
    @Column(name = "end_date")
    private String endDate;
    @OneToMany(mappedBy = "course")
    private List<Topic> topics;

    public Course(Long id, String name, String modality, String endDate) {
        this.id = id;
        this.name = name;
        this.modality = modality;
        this.endDate = endDate;
    }
    public Course() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) && Objects.equals(name, course.name) && Objects.equals(modality, course.modality) && Objects.equals(endDate, course.endDate) && Objects.equals(topics, course.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, modality, endDate, topics);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modality='" + modality + '\'' +
                ", endDate='" + endDate + '\'' +
                ", topics=" + topics +
                '}';
    }
}
