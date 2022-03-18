/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.repositorios;

import com.libreria.libreria.entidades.Editorial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andru
 */
@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, String> {
    @Query("Select a from Editorial a where a.alta = true")
    public List<Editorial> buscarAlta();
}
