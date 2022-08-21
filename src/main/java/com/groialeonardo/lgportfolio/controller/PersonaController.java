package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Persona;
import com.groialeonardo.lgportfolio.services.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PersonaController {
    
    @Autowired
    IPersonaService persoService;
    
    
    @GetMapping ("/personas")
    @ResponseBody
    public List<Persona> getPersonas () {
       return persoService.getAll();
    }
    
    @PostMapping ("/personas")
    @ResponseBody
    public Persona postPersona (@RequestBody Persona skill) {        
        return persoService.create(skill);

    }
    
    @PutMapping ("/personas/{id}")
    @ResponseBody
    public Persona putPersona (@RequestBody Persona skill) {
        return persoService.update(skill);

    }
    
    @DeleteMapping ("/personas/{id}")
    @ResponseBody
    public Persona deletePersona (@PathVariable long id) {        
        return persoService.delete(id);
    }

    
}
