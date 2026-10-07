package com.actividad.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.actividad.models.models.estudiante;

public interface estudianteRepository extends JpaRepository <estudiante,Long> {

    
}
