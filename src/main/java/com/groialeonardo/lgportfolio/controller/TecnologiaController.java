package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Tecnologia;
import com.groialeonardo.lgportfolio.services.ITecnologiaService;
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
public class TecnologiaController {
    
    @Autowired
    ITecnologiaService tecnoService;
    
    @GetMapping ("/tecnologies")
    @ResponseBody
    public List<Tecnologia> getTecnologias () {        
        return tecnoService.getAll();
    }
    
    @PostMapping ("/tecnologies")
    @ResponseBody
    public Tecnologia postTecnologia (@RequestBody Tecnologia tecno) {        
        return tecnoService.create(tecno);
    }
    
    @PutMapping ("/tecnologies/{id}")
    @ResponseBody
    public Tecnologia putTecnologia (@RequestBody Tecnologia tecno) {
        return tecnoService.update(tecno);
    }
    
    @DeleteMapping ("/tecnologies/{id}")
    @ResponseBody
    public Tecnologia deleteTecnologia (@PathVariable long id) {        
        return tecnoService.delete(id);   
    }    
    
}
