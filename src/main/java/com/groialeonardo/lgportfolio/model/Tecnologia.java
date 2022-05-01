
package com.groialeonardo.lgportfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {

    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String pathlogo;
    private int maxHeight;
    private boolean imgFluid;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "tecnologias")
    private Set<Proyecto> proyectos = new HashSet<>();
    

    public Tecnologia() {
    }

    public Tecnologia(Long id, String name, String pathlogo, int maxHeight, boolean imgFluid) {
        this.id = id;
        this.name = name;
        this.pathlogo = pathlogo;       
        this.maxHeight = maxHeight;
        this.imgFluid = imgFluid;
    }
  
  
    
}
