
package com.groialeonardo.lgportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
    
    private String pathlogo;
    private String empresa;
    private String puesto;
    private String inicio;
    private String fin;
    private String descripcion;

    public Experiencia() {
    }
    
    

    public Experiencia(Long id, String pathlogo, String empresa, String puesto, String inicio, String fin, String descripcion) {
        this.id = id;
        this.pathlogo = pathlogo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }
  
  
    
}
