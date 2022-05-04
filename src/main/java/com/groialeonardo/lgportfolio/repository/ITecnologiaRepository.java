package com.groialeonardo.lgportfolio.repository;

import com.groialeonardo.lgportfolio.model.Tecnologia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITecnologiaRepository extends JpaRepository <Tecnologia, Long> {
    List<Tecnologia> findAllByOrderByIdAsc();
}
