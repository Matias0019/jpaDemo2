
package com.jpaDemo2.jpaDemo2.service;

import com.jpaDemo2.jpaDemo2.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersonas ();
    
    public void savePersona (Persona perso);
    
    public void deletePersona(Long id);
    
    public Persona findPersona (Long id);
}
