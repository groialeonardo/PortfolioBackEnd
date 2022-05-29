
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
public class Persona implements Serializable  {
    
    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;    
    private String nombres;
    private String apellido;
    private String fecha_nacimiento;
    private String nacionalidad;
    private String mail;
    @Column(columnDefinition="TEXT")
    private String sobre_mi;
    private String ocupacion;
    private String image_background_header;
    private String image_perfil;
    private String linkedin_link;
    private String github_link;
    private String facebook_link;
    private String instagram_link;
    private String twitter_link;
    //TO DO: Agregar Domicilio

    public Persona() {
    }   

    public Persona(Long id, String nombres, String apellido, String fecha_nacimiento, String nacionalidad, String mail, String sobre_mi, String ocupacion, String image_background_header, String image_perfil, String linkedin_link, String github_link, String facebook_link, String instagram_link, String twitter_link) {
        this.id = id;
        this.nombres = nombres;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.mail = mail;
        this.sobre_mi = sobre_mi;
        this.ocupacion = ocupacion;
        this.image_background_header = image_background_header;
        this.image_perfil = image_perfil;
        this.linkedin_link = linkedin_link;
        this.github_link = github_link;
        this.facebook_link = facebook_link;
        this.instagram_link = instagram_link;
        this.twitter_link = twitter_link;
    }

    
}
