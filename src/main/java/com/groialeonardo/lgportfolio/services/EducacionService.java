
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Educacion;
import com.groialeonardo.lgportfolio.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    IEducacionRepository educRepo;

    @Override
    public List<Educacion> getAll() {
       //return educRepo.findAll();
       return educRepo.findAllByOrderByInicioDesc();
    }

    @Override
    public Educacion create(Educacion educ) {
        return educRepo.save(educ);
    }

    @Override
    public Educacion update(Educacion educ) {
        return educRepo.save(educ);
    }

    @Override
    public Educacion delete(Long id) {
        Educacion educToDelete = educRepo.findById(id).orElse(null);
        educRepo.deleteById(id);
        return educToDelete;
    }
    
}
