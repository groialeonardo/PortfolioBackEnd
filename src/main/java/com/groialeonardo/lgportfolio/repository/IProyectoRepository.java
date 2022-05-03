
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto,Long> {
    List<Proyecto> findAllByOrderByIdAsc();
    
}
