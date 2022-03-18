/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.servicios;

import com.libreria.libreria.entidades.Editorial;
import com.libreria.libreria.errores.ErrorServicio;
import com.libreria.libreria.repositorios.EditorialRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andru
 */
@Service
public class EditorialServicio {
    
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    public void ingresarEditorial(String nombre) throws ErrorServicio{
        validar(nombre);
        
        Editorial editorial = new Editorial();

        editorial.setNombre(nombre);
        editorial.setAlta(true);

        editorialRepositorio.save(editorial);
        
    }
    
    public void modificarEditorial(String id, String nombre) throws ErrorServicio{
        
        validar(nombre);

        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
      
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            
            editorial.setId(id);
            editorial.setNombre(nombre);
            editorial.setAlta(true);

            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("No se encontró una editorial con ese nombre");
        }
    }
    
    public void deshabilitar(String id) throws ErrorServicio {
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if(respuesta.isPresent()){
            Editorial editorial = respuesta.get();
            
            editorial.setAlta(false);
            
            editorialRepositorio.save(editorial);
        } else {
            throw new ErrorServicio("No se encontró una editorial con ese nombre");
        }

    }
    
     public List<Editorial> obtener (){
        
        return editorialRepositorio.findAll();
    }
     
     public List<Editorial> obtenerAlta(){
         return editorialRepositorio.buscarAlta();
     }
    
    public void validar(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre de la editorial no puede estar vacio");
        }
    }
    
}
