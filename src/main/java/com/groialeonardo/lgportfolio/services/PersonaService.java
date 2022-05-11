
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Persona;
import com.groialeonardo.lgportfolio.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public IPersonaRepository persoRepo;
    

    @Override
    public List<Persona> getAll() {
        return persoRepo.findAll();
    }

    @Override
    public Persona create(Persona pers) {
        return persoRepo.save(pers);
    }

    @Override
    public Persona update(Persona pers) {
        return persoRepo.save(pers);
    }

    @Override
    public Persona delete(Long id) {
                Persona skillToDelete = persoRepo.findById(id).orElse(null);
        persoRepo.deleteById(id);
        return skillToDelete;
    }
    
}
