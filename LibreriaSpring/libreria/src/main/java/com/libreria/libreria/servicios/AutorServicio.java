/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.servicios;

import com.libreria.libreria.entidades.Autor;
import com.libreria.libreria.errores.ErrorServicio;
import com.libreria.libreria.repositorios.AutorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andru
 */
@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    public void ingresarAutor(String nombre) throws ErrorServicio {

        validar(nombre);

        Autor autor = new Autor();

        autor.setNombre(nombre);
        autor.setAlta(true);

        autorRepositorio.save(autor);

    }

    public void modificarAutor(String id, String nombre) throws ErrorServicio {
        validar(nombre);

        Optional<Autor> respuesta = autorRepositorio.findById(id);
        Autor autor = new Autor();
        if (respuesta.isPresent()) {
            
            autor = respuesta.get();
            
            autor.setId(id);
            autor.setNombre(nombre);
            autor.setAlta(true);

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontró un autor con ese nombre");
        }

    }

    public void deshabilitar(String id) throws ErrorServicio {
        Optional<Autor> respuesta = autorRepositorio.findById(id);
//        Optional<Autor> respuest = autorRepositorio.findById(nombre);

        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();

            autor.setAlta(false);

            autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontró un autor con ese nombre");
        }

    }

//    public List<Autor> obtener (){
//        
//        return autorRepositorio.findAll();
//    }
    public List<Autor> obtenerAlta() {

        return autorRepositorio.buscarAlta();
    }

    private void validar(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre del autor no puede estar vacio");
        }
    }

}
