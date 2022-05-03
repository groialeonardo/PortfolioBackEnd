
package com.groialeonardo.lgportfolio.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
  
    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    private String pathimg;
    private String titulo;
    
    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="proyecto_tecnologia",
            joinColumns = @JoinColumn(name = "proyecto_id"),
            inverseJoinColumns = @JoinColumn(name = "tecnologia_id")
    )
    private Set<Tecnologia> tecnologias = new HashSet<>();
    
    private String fecha;  
    private String descripcion;
    private String projectLink;

    public Proyecto() {
    }

    public Proyecto(Long id, String pathimg, String titulo, Set<Tecnologia> tecnologias, String fecha, String descripcion, String projectLink) {
        this.id = id;
        this.pathimg = pathimg;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.projectLink = projectLink;
    }


    

    
    
    
}
