package com.actividad.models.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad.models.models.carrera;
import com.actividad.models.repositories.carreraRepository;

@RestController 
@RequestMapping ("/api/v1/inscripcion")
public class carreraController{
     @Autowired
     private carreraRepository repo;
     @GetMapping 
     public List <carrera> geInscripcion (){
         return repo.findAll();   
     }
     @PostMapping 
     public carrera crearInscripcion (@RequestBody carrera c){
        return repo.save(c);
     }


}