/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.persistencia;

import Libreria.entidades.Editorial;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author andru
 */
public class EditorialDao extends Dao{
    
    public List<Editorial> buscarEditoralesPorID(Integer nombre) {
        conectar();
        List<Editorial> listaEditoriales = null; 
        try {
            String consulta = "select a from Editorial a where a.id like :lokeyokiera";
            Query q = em.createQuery(consulta).setParameter("lokeyokiera", nombre);
            listaEditoriales = q.getResultList();
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
        return listaEditoriales;

    }
    
    public List<Editorial> buscarEditorialPorNombre (String nombre){
        
        conectar();
        List listaEditoriales = null; 
        try {
            String consulta = "select e from editorial e where e.nombre like :nombreEditorial";
            Query q = em.createQuery(consulta).setParameter("nombreEditorial", nombre);
            listaEditoriales = q.getResultList();
            
        } catch (Exception e) {
        } finally {
            desconectar();
        }
        
        return listaEditoriales;
    }
    
}
