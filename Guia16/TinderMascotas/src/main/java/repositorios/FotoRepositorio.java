/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author andru
 */
public interface FotoRepositorio extends JpaRepository<Foto, String> {
    
}
