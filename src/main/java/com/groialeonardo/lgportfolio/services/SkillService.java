
package com.groialeonardo.lgportfolio.services;

import com.groialeonardo.lgportfolio.model.Skill;
import com.groialeonardo.lgportfolio.repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
        
    @Autowired
    public ISkillRepository skillRepo;

    @Override
    public List<Skill> getAll() {
       
        return skillRepo.findAll();
       
    }

    @Override
    public Skill create(Skill exp) {
        return skillRepo.save(exp);
        
    }

    @Override
    public Skill update(Skill exp) {
       return skillRepo.save(exp);
    }

    @Override
    public Skill delete(Long id) {
        Skill expToDelete = skillRepo.findById(id).orElse(null);
        skillRepo.deleteById(id);
        return expToDelete;
    }
    
}
    

