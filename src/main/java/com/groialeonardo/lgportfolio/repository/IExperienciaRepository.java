
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long> {
    List<Experiencia> findAllByOrderByInicioDesc();
    
}
