/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjpa.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nahue
 */
public class Dao<T extends Object> {
    
   protected EntityManager em = Persistence.createEntityManagerFactory("conexionServidorLocalABaseDatosPersona").createEntityManager();
    
    protected void conectar() {
        if (!em.isOpen()) {
            em = Persistence.createEntityManagerFactory("IntroduccionJPAPU").createEntityManager();
        }
    }
    
    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
    public T guardar(T objeto) {
        conectar();
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Ocurrio un error al persistir el objeto de tipo: "+objeto.getClass().getSimpleName());
        } finally {
            desconectar();
        }
        return objeto;
    }
}
