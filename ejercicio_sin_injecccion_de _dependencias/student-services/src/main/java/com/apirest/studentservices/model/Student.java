package com.apirest.studentservices.model;


/**
 * Clase para representar a los estudiantes
 *
 */
public class Student {
    //identificador del estudiante
    private String id;
    //Nombre del estudiante
    private String name;
    // Camino de desarrollo al que pertenece el estudiante
    private String path;

    public Student(String id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}
