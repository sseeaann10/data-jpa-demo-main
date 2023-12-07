package com.example.demospringnextu.repositories;

import com.example.demospringnextu.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    List<Professor> findByNameContaining(String search);
}
