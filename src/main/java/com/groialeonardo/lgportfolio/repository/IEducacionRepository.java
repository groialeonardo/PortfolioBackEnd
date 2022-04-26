
package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long>{
    
}
