/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.repositorios;

import com.libreria.libreria.entidades.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andru
 */
@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{
    @Query("Select a from Autor a where a.nombre = :nombre")
    public Autor buscarPorNombre(@Param("nombre") String nombre);
        
    @Query("Select b from Autor b where b.alta = true")
    public List<Autor> buscarAlta();
    
    
    
    
}
