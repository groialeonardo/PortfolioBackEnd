package com.groialeonardo.lgportfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity

public class Educacion implements Serializable {
    
    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;    
    private String pathlogo;
    private String institucion;
    private String titulo;
    private String inicio;
    private String fin;
    @Column(columnDefinition="TEXT")
    private String descripcion;

    public Educacion() {
    }

    public Educacion(Long id, String pathlogo, String institucion, String titulo, String inicio, String fin, String descripcion) {
        this.id = id;
        this.pathlogo = pathlogo;
        this.institucion = institucion;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }
    
    

  
    
    
}
