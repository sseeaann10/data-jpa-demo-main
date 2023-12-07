package com.example.demospringnextu.services;

import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.repositories.StudentGroupRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class StudentGroupService {

    private final StudentGroupRepository studentGroupRepository;

    public StudentGroup getStudentGroup(Integer studentGroupId) {
        return studentGroupRepository.findById(studentGroupId).orElse(null);
    }
}