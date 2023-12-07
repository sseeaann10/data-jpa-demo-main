package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.Student;
import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }


    @GetMapping("/name_contains/{search}")
    public List<Student> getStudentWithNameContaining(@PathVariable("search") String search) {
        return studentService.getStudentWithNameContaining(search);
    }

    @GetMapping("/age_max/{search}")
    public List<Student> getStudentWithNameContaining(@PathVariable("search") Integer maxAge) {
        return studentService.getStudentWithAgeLessThan(maxAge);
    }


    @GetMapping("/mail_domain/{mailDomain}")
    public List<Student> getStudentWithMailDomain(@PathVariable("mailDomain") String mailDomain) {
        return studentService.getStudentWithMailDomain(mailDomain);
    }

    // TODO
    // Ajouter les professeurs : un professeur est relié à une école, une école a plusieurs professeurs
    // Un professeur a un id, un nom, un prenom, un mail et une matière (type String) et donne des cours

    // Ajouter un cours: qui a un nom et une durée
    // Un cours est relié à un groupe d'étudiants
    // Chaque cours est dispensé par un professeur

    // Faire un service qui remonte tous les professeurs
    // Faire un service qui remonte un professeur par id
    // Faire un service qui remonte les professeurs n'ayant qu'une chaine de caractères dans leur nom

    // Aide: pour cours et professeurs je souhaite voir:
    // Une classe Cours / Une classe Professeur
    // Un service chacun
    // Forcément un repo chacun
    // Et por remonter les infos du professeur, un controleur

    // BONUS: Faire un service qui remonte tous les cours pour un groupe d'étudiants donné

    // MEGA BONUS: Où stockons nous les notes des étudiants à un cours ?
    // Faire un service pour insérer la note d'un étudiant à un cours

    // Mon mail : florian@jetdev.fr
    // Mon Discord : jetflo


}