package com.apirest.studentservices.controller;

import com.apirest.studentservices.model.Student;
import com.apirest.studentservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    /**
     * Metodo que maneja una peticion GET
     * Regresa una lista de estudiantes
     * @return Student el estudiante que fue encontrado.
     */
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    /**
     * Metodo que maneja una peticion GET
     * Regresa a un estudiante en particular
     * @param  studentId identificador del student a buscar
     * @return Student el estudiante que fue encontrado.
     */
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return studentService.getStudent(studentId);
    }

}
