
package com.portfolio.jjt.Service;


import com.portfolio.jjt.Entity.Persona;
import com.portfolio.jjt.Interface.IPersonaService;
import com.portfolio.jjt.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;


    @Override
    public java.util.List<Persona> getPersona(){
        java.util.List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
       ipersonaRepository.save(persona);
    }
    
    @Override
    public void deletePersona(Long id) {
       ipersonaRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
    
}
