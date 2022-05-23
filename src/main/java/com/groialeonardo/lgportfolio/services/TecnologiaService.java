package com.groialeonardo.lgportfolio.services;


import com.groialeonardo.lgportfolio.model.Tecnologia;
import com.groialeonardo.lgportfolio.repository.ITecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    public ITecnologiaRepository tecnoRepo;
    
    @Override
    public List<Tecnologia> getAll() {
       // return proyRepo.findAll();
       return tecnoRepo.findAllByOrderByIdAsc();
    }

    @Override
    public Tecnologia create(Tecnologia tecno) {
       return tecnoRepo.save(tecno);
    }

    @Override
    public Tecnologia update(Tecnologia tecno) {
        return tecnoRepo.save(tecno);
    }

    @Override
    public Tecnologia delete(Long id) {
        
        Tecnologia proy = tecnoRepo.findById(id).orElse(null);
        // TO DO, se debe hacer una validacion de que esta tecnología no esté ligada a algún proyecto antes de proceder a su eliminacion
                
        Tecnologia tecnoToDelete = new Tecnologia();
        tecnoToDelete.setId(proy.getId());                
       
        tecnoRepo.deleteById(id);
        
        return tecnoToDelete;
    }
    
}
