
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Experiencia;
import com.groialeonardo.lgportfolio.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService  {
    
    @Autowired
    public IExperienciaRepository expRepo;

    @Override
    public List<Experiencia> getAll() {
       
        //return expRepo.findAll();
       return expRepo.findAllByOrderByInicioDesc();
       
    }

    @Override
    public Experiencia create(Experiencia exp) {
        return expRepo.save(exp);
        
    }

    @Override
    public Experiencia update(Experiencia exp) {
       return expRepo.save(exp);
    }

    @Override
    public Experiencia delete(Long id) {
        Experiencia expToDelete = expRepo.findById(id).orElse(null);
        expRepo.deleteById(id);
        return expToDelete;
    }
    
}
