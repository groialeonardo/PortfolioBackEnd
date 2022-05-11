
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
