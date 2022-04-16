
package com.groialeonardo.lgportfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Experiencia {
    
 private long id;
 private String pathlogo;
 private String empresa;
 private String puesto;
 private String inicio;
 private String fin;
 private String descripcion;

    public Experiencia(long id, String pathlogo, String empresa, String puesto, String inicio, String fin, String descripcion) {
        this.id = id;
        this.pathlogo = pathlogo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }
  
  
    
}
