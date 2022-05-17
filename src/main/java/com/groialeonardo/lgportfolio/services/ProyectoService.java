
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Proyecto;
import com.groialeonardo.lgportfolio.model.Tecnologia;
import com.groialeonardo.lgportfolio.repository.IProyectoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public IProyectoRepository proyRepo;
    
    
    @Override
    public List<Proyecto> getAll() {
       // return proyRepo.findAll();
      // return proyRepo.findAllByOrderByIdAsc();
      return proyRepo.findAllByOrderByFechaDesc();
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
        
        Proyecto proy = proyRepo.findById(id).orElse(null);
        
        //Set<Tecnologia> tecnosToDelete = proy.getTecnologias();
        
        Proyecto proyToDelete = new Proyecto();
        proyToDelete.setId(proy.getId());
                
        // Proyecto proyToDelete = new Proyecto(proy.getId(), proy.getPathimg(),proy.getTitulo(),tecnosToDelete, proy.getFecha(),proy.getDescripcion(),proy.getProjectLink());
        proyRepo.deleteById(id);
        
        return proyToDelete;
    }
    
}
