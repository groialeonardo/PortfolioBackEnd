
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Educacion;
import com.groialeonardo.lgportfolio.services.IEducacionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class EducacionController {
    
    @Autowired
    public IEducacionService educService;
    
    @GetMapping ("/educations")
    @ResponseBody
    public List<Educacion> getEducs () {
        return educService.getAll();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/educations")
    @ResponseBody
    public Educacion postEduc (@RequestBody Educacion educ) {
        return educService.create(educ);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/educations/{id}")
    @ResponseBody
    public Educacion putEduc (@RequestBody Educacion educ){
        return educService.update(educ);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/educations/{id}")
    @ResponseBody
    public Educacion deleteEduc (@PathVariable long id){
        return educService.delete(id);
    }
}
