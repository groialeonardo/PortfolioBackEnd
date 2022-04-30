
package com.groialeonardo.lgportfolio.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
//@Entity
public class Proyecto {
    
  
//    @Id 
//   @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    private String pathimg;
    private String titulo;
    
    private List<Tecnologia> tecnologias ;
    
    private String fecha;  
    private String descripcion;
    private String projectLink;

    public Proyecto() {
    }

    public Proyecto(Long id, String pathimg, String titulo, List<Tecnologia> tecnologias, String fecha, String descripcion, String projectLink) {
        this.id = id;
        this.pathimg = pathimg;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.projectLink = projectLink;
    }




    
    
    
}
