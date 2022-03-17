/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjpa;

import introduccionjpa.entidades.Persona;
import introduccionjpa.servicios.PersonaServicio;
import java.util.List;

/**
 *
 * @author nahue
 */
public class IntroduccionJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona = new Persona();
        persona.setNombre("Nahuel");
        personaServicio.guardarPersona(persona);
        System.out.println(persona.toString());
    }
    
}
