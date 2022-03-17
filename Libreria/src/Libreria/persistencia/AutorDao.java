/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Autor;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author andru
 */
public class AutorDao extends Dao {

    public List<Autor> listaAutores() {
        conectar();
        List listaAutores = null; 
        try {
            String consulta = "select a from Autor a";
            Query q = em.createQuery(consulta);
            listaAutores = q.getResultList();
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
        return listaAutores;

    }
    
    public List<Autor> buscarAutores(String nombre) {
        conectar();
        List listaAutores = null; 
        try {
            String consulta = "select a from Autor a where a.nombre like :lokeyokiera";
            Query q = em.createQuery(consulta).setParameter("lokeyokiera", nombre);
            listaAutores = q.getResultList();
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
        return listaAutores;

    }
    
    public List<Autor> buscarAutoresPorID(Integer nombre) {
        conectar();
        List listaAutores = null; 
        try {
            String consulta = "select a from Autor a where a.id = :ID";
            Query q = em.createQuery(consulta).setParameter("ID", nombre);
            listaAutores = q.getResultList();
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
        return listaAutores;

    }

}
