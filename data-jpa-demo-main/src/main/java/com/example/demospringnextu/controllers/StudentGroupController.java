package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.services.StudentGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("student_groups")
public class    StudentGroupController {

    private final StudentGroupService studentGroupService;

    @GetMapping("/{id}")
    public StudentGroup getStudentGroup(@PathVariable("id") Integer id) {
        return studentGroupService.getStudentGroup(id);
    }
}
