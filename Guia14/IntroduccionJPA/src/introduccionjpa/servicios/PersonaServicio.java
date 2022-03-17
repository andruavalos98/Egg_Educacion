/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjpa.servicios;

import introduccionjpa.entidades.Persona;
import introduccionjpa.persistencia.Dao;
import introduccionjpa.persistencia.PersonaDao;

/**
 *
 * @author nahue
 */
public class PersonaServicio {
    
    private Dao personaDao = new PersonaDao();
    
    public Persona guardarPersona(Persona persona) {
        return (Persona) personaDao.guardar(persona);
    }
}
