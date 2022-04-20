
package com.groialeonardo.lgportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id 
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private Long id;
  
    private int percent;
    private int radius;
    private String imageSrc;
    private int imageHeight;
    private int imageWidth;

    public Skill() {
    }
    
    

    public Skill(Long id, int percent, int radius, String imageSrc, int imageHeight, int imageWidth) {
        this.id = id;
        this.percent = percent;
        this.radius = radius;
        this.imageSrc = imageSrc;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
    }

    
    
}
