package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Professor;
import com.example.demospringnextu.repositories.ProfessorRepository;
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
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Optional<Professor> getProfessorById(Integer professorId) {
        return professorRepository.findById(professorId);
    }

    public List<Professor> getProfessorsByNameContaining(String search) {
        return professorRepository.findByNameContaining(search);
    }
}
