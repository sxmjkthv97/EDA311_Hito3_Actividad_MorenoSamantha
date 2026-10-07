package com.actividad.models.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="carrera")
public class carrera {
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    Long id;
    String nombre;
    Integer creditos;
}
