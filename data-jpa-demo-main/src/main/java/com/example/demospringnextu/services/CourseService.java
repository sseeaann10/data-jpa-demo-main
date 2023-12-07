package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Course;
import com.example.demospringnextu.repositories.CourseRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class CourseService {

    private final CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Integer courseId) {
        return courseRepository.findById(courseId);
    }
    public List<Course> getCoursesByStudentGroupId(Integer studentGroupId) {
        return courseRepository.findAllByStudentGroup_StudentGroupId(studentGroupId);
    }
}
