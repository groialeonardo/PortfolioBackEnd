
package com.groialeonardo.lgportfolio.controller;

import com.groialeonardo.lgportfolio.model.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SkillController {
    
    @GetMapping ("/skills")
    @ResponseBody 
    public List<Skill> getExps () {
        
        List <Skill> listaSkills = new ArrayList<Skill>();
        listaSkills.add(new Skill(1, 90, 80, "../assets/img/Logos/Skills/html5w.png", 75, 50 ));
                
        return listaSkills;
    }
}
