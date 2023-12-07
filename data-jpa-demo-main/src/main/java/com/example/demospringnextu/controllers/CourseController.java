package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.Course;
import com.example.demospringnextu.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;


    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable Integer courseId) {
        return courseService.getCourseById(courseId).orElse(null);
    }
    @GetMapping("/group/{studentGroupId}")
    public ResponseEntity<List<Course>> getCoursesByStudentGroupId(@PathVariable Integer studentGroupId) {
        List<Course> courses = courseService.getCoursesByStudentGroupId(studentGroupId);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}
