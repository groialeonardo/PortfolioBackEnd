
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Proyecto;
import com.groialeonardo.lgportfolio.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public IProyectoRepository proyRepo;
    
    
    @Override
    public List<Proyecto> getAll() {
        return proyRepo.findAll();
    }

    @Override
    public Proyecto create(Proyecto proy) {
        
        return proyRepo.save(proy);
       
    }

    @Override
    public Proyecto update(Proyecto proy) {
        return proyRepo.save(proy);
    }

    @Override
    public Proyecto delete(Long id) {
        Proyecto proyToDelete = proyRepo.findById(id).orElse(null);
        proyRepo.deleteById(id);
        return proyToDelete;
    }
    
}
