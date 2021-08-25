package com.apirest.studentservices.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.apirest.studentservices.model.Student;

@Component
public class StudentService {

    private static List<Student> students = new ArrayList<>();

    //Variables estaticas para inicializar la lista de estudiantes
    static {
        Student std1 = new Student("1", "Miguel",
                "Microsevice  Developer");

        Student std2 = new Student("2", "Erick",
                "Software Architect");

        students.add(std1);
        students.add(std2);
    }

    /**
     * Regresa una lista de estudiantes
     * @return List<studen> una lista de estudiantes.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Regresa un  estudiante en particular
     * @param  studentId identificador del student a buscar
     * @return Student el estudiante que fue encontrado.
     */
    public Student getStudent(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

}
