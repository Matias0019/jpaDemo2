
package com.jpaDemo2.jpaDemo2.repository;


import com.jpaDemo2.jpaDemo2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends JpaRepository <Persona ,Long> {
    
}
