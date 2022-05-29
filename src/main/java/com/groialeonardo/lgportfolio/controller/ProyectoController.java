
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Proyecto;
import com.groialeonardo.lgportfolio.services.IProyectoService;
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
public class ProyectoController {
    

    @Autowired
    IProyectoService proyService;    
          
    @GetMapping ("/projects")
    @ResponseBody
    public List<Proyecto> getProyectos () {        
        return proyService.getAll();
    }
    
    @PostMapping ("/projects")
    @ResponseBody
    public Proyecto postProyecto (@RequestBody Proyecto proy) {        
        return proyService.create(proy);
    }
   
    @PutMapping ("/projects/{id}")
    @ResponseBody
    public Proyecto putProyecto (@RequestBody Proyecto proy) {
        return proyService.update(proy);

    }
    
    @DeleteMapping ("/projects/{id}")
    @ResponseBody
    public Proyecto deleteProyecto (@PathVariable long id) {        
        return proyService.delete(id);        

    }

}