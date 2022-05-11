
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Skill;
import com.groialeonardo.lgportfolio.services.ISkillService;
//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SkillController {
    
    @Autowired
    public ISkillService skillService;
    
    @GetMapping ("/skills")
    @ResponseBody 
    public List<Skill> getSkills () {
        /*
        List <Skill> listaSkills = new ArrayList<Skill>();
        listaSkills.add(new Skill(new Long(1), 90, 80, "../assets/img/Logos/Skills/html5w.png", 75, 50 ));
                
        return listaSkills;*/
       return skillService.getAll();
    }
    
    @PostMapping ("/skills")
    @ResponseBody
    public Skill postSkill (@RequestBody Skill skill) {
        
        return skillService.create(skill);

    }
    
    @PutMapping ("/skills/{id}")
    @ResponseBody
    public Skill putSkill (@RequestBody Skill skill) {
        return skillService.update(skill);

    }
    
    @DeleteMapping ("/skills/{id}")
    @ResponseBody
    public Skill deleteSkill (@PathVariable long id) {
        
        return skillService.delete(id);

    }
    
    
    
}
