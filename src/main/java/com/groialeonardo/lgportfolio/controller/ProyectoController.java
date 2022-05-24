
package com.groialeonardo.lgportfolio.controller;
//para prueba
import com.groialeonardo.lgportfolio.model.Proyecto;
//import com.groialeonardo.lgportfolio.model.Tecnologia;
//import com.groialeonardo.lgportfolio.repository.IProyectoRepository;
import com.groialeonardo.lgportfolio.services.IProyectoService;
//import java.util.ArrayList;
//

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
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
    
   // @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/projects")
    @ResponseBody
    public Proyecto postProyecto (@RequestBody Proyecto proy) {
        
        return proyService.create(proy);

    }
    
   // @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/projects/{id}")
    @ResponseBody
    public Proyecto putProyecto (@RequestBody Proyecto proy) {
        return proyService.update(proy);

    }
    
   // @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/projects/{id}")
    @ResponseBody
    public Proyecto deleteProyecto (@PathVariable long id) {
        
        return proyService.delete(id);        

    }

}