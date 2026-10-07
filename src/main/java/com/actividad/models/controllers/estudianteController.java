package com.actividad.models.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.actividad.models.models.estudiante;
import com.actividad.models.repositories.estudianteRepository;

@RestController 

@RequestMapping ("/api/v1/estudiante")

public class estudianteController{
    @Autowired 
    private estudianteRepository repo; 
    @GetMapping 
public List <estudiante> getestudiantes () {
   return repo.findAll();   
}
@PostMapping 
public estudiante crearestudiante (@RequestBody estudiante e ){
    return repo.save(e);
}
}

