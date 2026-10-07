package com.actividad.models.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad.models.models.inscripcion;
import com.actividad.models.repositories.inscripcionRepository;

@RestController 
@RequestMapping ("/api/v1/inscripcion")
public class inscripcionController{
     @Autowired
     private inscripcionRepository repo;
     @GetMapping 
     public List <inscripcion> geInscripcion (){
         return repo.findAll();   
     }
     @PostMapping 
     public inscripcion crearInscripcion (@RequestBody inscripcion i){
        return repo.save(i);
     }


}