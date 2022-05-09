
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Experiencia;
import com.groialeonardo.lgportfolio.services.IExperienciaService;
//import java.util.ArrayList;
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
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService expService;
    
    
   /* List <Experiencia> listaExps = new ArrayList<Experiencia>();
    long id_exp = 1;*/
    
    @GetMapping ("/exps")
    @ResponseBody
    public List<Experiencia> getExps () {
    
        return expService.getAll();
       
    /*    listaExps.add(new Experiencia(1,
                "../../../../assets/img/Logos/Experiencias/Paladini.jpg",
                "Paladini",
                "Supervisor de Automatización",
                "12-2015",
                "Actual",
                "Supervisor de Automatizacion Industrial, Calibracion de Instrumentos de Medicion"));
        
        
     return listaExps;*/
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/exps")
    @ResponseBody
    public Experiencia postExp (@RequestBody Experiencia exp) {
        
        return expService.create(exp);
   /* exp.setId(id_exp);
    id_exp++;
    listaExps.add(exp);
    //listaExps.get(listaExps.size()-1).setId(listaExps.size());
    
    return listaExps.get(listaExps.size()-1); */
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/exps/{id}")
    @ResponseBody
    public Experiencia putExp (@RequestBody Experiencia exp) {
        return expService.update(exp);
   /*     
    for(int i=0; i<listaExps.size();i++ ){
      if (listaExps.get(i).getId() == exp.getId()){
          
        listaExps.remove(i);
        listaExps.add(exp);
                    
      }
    }
        
    return listaExps.get(listaExps.size()-1);*/
    }
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/exps/{id}")
    
   // @RequestMapping(value = "/exps/{id}", produces = "application/json", method=RequestMethod.DELETE)
    @ResponseBody
    public Experiencia deleteExp (@PathVariable long id) {
        
        return expService.delete(id);
        
     /*    Long idmock = new Long (999);
        Experiencia exp = new Experiencia(idmock,"void","void","void","void","void","void");
        
    for(int i=0; i<listaExps.size();i++ ){
      if (listaExps.get(i).getId() == id){
          
          exp =listaExps.get(i);
          listaExps.remove(i);
          
      }
    }
    
    return exp;*/
    }
    

}
