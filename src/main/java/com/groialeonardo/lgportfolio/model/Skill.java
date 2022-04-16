
package com.groialeonardo.lgportfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Skill {
    
    private long id;
  
 private int percent;
 private int radius;
 private String imageSrc;
 private int imageHeight;
 private int imageWidth;

    public Skill(long id, int percent, int radius, String imageSrc, int imageHeight, int imageWidth) {
        this.id = id;
        this.percent = percent;
        this.radius = radius;
        this.imageSrc = imageSrc;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
    }

    
    
}
