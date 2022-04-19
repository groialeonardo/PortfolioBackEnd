
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
    public List<Experiencia> getAllExps() {
       
        return expRepo.findAll();
       
    }

    @Override
    public Experiencia createExp(Experiencia exp) {
        return expRepo.save(exp);
        
    }

    @Override
    public Experiencia updateExp(Experiencia exp) {
       return expRepo.save(exp);
    }

    @Override
    public Experiencia deleteExp(Long id) {
        Experiencia expToDelete = expRepo.findById(id).orElse(null);
        expRepo.deleteById(id);
        return expToDelete;
    }
    
}
