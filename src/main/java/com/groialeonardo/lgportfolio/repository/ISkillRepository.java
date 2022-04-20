
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ISkillRepository extends JpaRepository <Skill, Long> {
    
}
