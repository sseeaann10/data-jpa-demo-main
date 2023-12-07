package com.example.demospringnextu.repositories;

import com.example.demospringnextu.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGroupRepository extends JpaRepository<StudentGroup, Integer> {
}