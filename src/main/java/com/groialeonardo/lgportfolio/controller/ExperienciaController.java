package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Experiencia;
import com.groialeonardo.lgportfolio.services.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService expService;
    
    @GetMapping ("/exps")
    @ResponseBody
    public List<Experiencia> getExps () {    
        return expService.getAll();       

    }
    
    @PostMapping ("/exps")
    @ResponseBody
    public Experiencia postExp (@RequestBody Experiencia exp) {        
        return expService.create(exp);

    }   
    

    @PutMapping ("/exps/{id}")
    @ResponseBody
    public Experiencia putExp (@RequestBody Experiencia exp) {
        return expService.update(exp);

    }
    
    
    @DeleteMapping ("/exps/{id}") 
    @ResponseBody
    public Experiencia deleteExp (@PathVariable long id) {        
        return expService.delete(id);
    }
    

}
