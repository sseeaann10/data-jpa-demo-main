package com.example.demospringnextu.repositories;

import com.example.demospringnextu.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByNameContains(String name);

    List<Student> findAllByAgeLessThan(Integer age);

    List<Student> findAllByMailEndsWith(String mailDomain);
}