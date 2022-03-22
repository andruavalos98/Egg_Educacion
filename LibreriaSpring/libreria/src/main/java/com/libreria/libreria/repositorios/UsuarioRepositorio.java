/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.repositorios;

import com.libreria.libreria.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andru
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,String>{
    @Query("Select u from Usuario u where u.username = :pepe")
    public Usuario buscarUsuarioPorUsername(@Param("pepe") String usuario);
    
    // otra forma sin jpql
    //si lo escribo en camelcase entonces lo puede convertir en una consulta jpql
    
    public Usuario findByUsername(String username);
}
