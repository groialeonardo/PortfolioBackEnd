
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Experiencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ExperienciaController {
    
    @GetMapping ("/exps")
    @ResponseBody
    public List<Experiencia> getExps () {
        
        List <Experiencia> listaExps = new ArrayList<Experiencia>();
        listaExps.add(new Experiencia(1,
                "../../../../assets/img/Logos/Experiencias/Paladini.jpg",
                "Paladini",
                "Supervisor de Automatización",
                "12-2015",
                "Actual",
                "Supervisor de Automatizacion Industrial, Calibracion de Instrumentos de Medicion"));
        
        
     return listaExps;
    }
    

}
