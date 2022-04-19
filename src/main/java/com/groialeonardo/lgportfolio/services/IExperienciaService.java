
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List <Experiencia> getAllExps ();
    
    public Experiencia createExp (Experiencia exp);
    
    public Experiencia updateExp (Experiencia exp);
    
    public Experiencia deleteExp (Long id);
       
    
}
