package com.actividad.models.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name ="estudiante")
public class estudiante {
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    Long id;
    String nombre_estudiante;
    String email;
    String carrera;
}
