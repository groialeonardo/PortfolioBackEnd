
package com.groialeonardo.lgportfolio.controller;
//para prueba
import com.groialeonardo.lgportfolio.model.Proyecto;
import com.groialeonardo.lgportfolio.model.Tecnologia;
import java.util.ArrayList;
//

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProyectoController {
    
    List <Tecnologia> listaTecnologias = new ArrayList();
    List <Tecnologia> listaTecnologias2 = new ArrayList();
    List <Proyecto> listaProyectos = new ArrayList();
    Proyecto proyecto;
    Tecnologia tecnologia;
   /* long id_exp = 1;*/
    
    @GetMapping ("/projects")
    @ResponseBody
    public List<Proyecto> getProyectos () {

        //return expService.getAll();
        listaTecnologias.clear();
        listaTecnologias2.clear();
        listaProyectos.clear();
           
        tecnologia = new Tecnologia (new Long(1), "HTML", "http://localhost:4200/assets/img/Logos/Skills/color/html.png", 70, true);
        listaTecnologias.add(tecnologia);
        tecnologia = new Tecnologia (new Long(2), "CSS", "http://localhost:4200/assets/img/Logos/Skills/color/css.png", 70, true);
        listaTecnologias.add(tecnologia);
        proyecto = new Proyecto(new Long(1), "../../../../assets/img/Proyectos/argentinaprograma.PNG", "Arg Programa", listaTecnologias, "2021", "SAAAAAAAAAAA", "http://localhost:4200");
        listaProyectos.add(proyecto);
            
            
       tecnologia = new Tecnologia (new Long(3), "JS", "http://localhost:4200/assets/img/Logos/Skills/color/js.png", 70, true);
        listaTecnologias2.add(tecnologia);
        proyecto = new Proyecto(new Long(2), "../../../../assets/img/Proyectos/argentinaprograma.PNG", "Arg Programa2", listaTecnologias2, "2022", "SAAAAAAAAAAARAAAASAA", "http://www.google.com");

        listaProyectos.add(proyecto);
            
        return listaProyectos;
    }

}