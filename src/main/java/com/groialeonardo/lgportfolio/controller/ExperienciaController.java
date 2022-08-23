package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.MovieInfo;
import com.groialeonardo.lgportfolio.model.Experiencia;
import com.groialeonardo.lgportfolio.model.MovieResp;
import com.groialeonardo.lgportfolio.services.IExperienciaService;
import java.util.Arrays;
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
import org.springframework.web.client.RestTemplate;


@CrossOrigin
@RestController
public class ExperienciaController {
    
    @Autowired
    IExperienciaService expService;
    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping ("/Titles")
    public String[]  getTitles () {                  
            MovieResp response =  restTemplate.getForObject(
                  //"https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman&page=2",
                    "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman",
                  MovieResp.class);

           MovieInfo[] movies = response.getData();
           
           String[] Titles = new String[response.getPer_page()];

            for (int i = 0; i < movies.length ; i++) {                
                    Titles[i] = movies[i].getTitle(); 
                    //System.out.println(movies[i].getTitle());                        
            }
            
            Arrays.sort(Titles); 
            
            return Titles;

    }
    
   /* 
    @GetMapping ("/exps")
    @ResponseBody
    public List<Educacion> getExps2 () { 
        
          Educacion [] exps = restTemplate.getForObject("http://localhost:8080/educations",  
                  Educacion[].class);  
          
          List< Educacion> m = Arrays.asList(exps);
          
          return m;

    }
    */

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
