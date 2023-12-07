package com.example.demospringnextu.repositories;

import com.example.demospringnextu.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findAllByStudentGroup_StudentGroupId(Integer studentGroupId);
}
