package com.actividad.models.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table (name= "inscripcion")
public class inscripcion {
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    Long id;
    Long estudianteId;
    Long carreraId;
    LocalDate fechainscripcion;
}
