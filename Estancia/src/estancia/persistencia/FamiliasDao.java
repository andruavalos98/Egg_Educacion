/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Familias;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andru
 */
public class FamiliasDao extends Dao {
    
    public List<Familias> listAll(){
        String query = "select * from familias";
        consultar(query);
        List<Familias> familias = new ArrayList<>();
        Familias familia;
        
        try {
            while (resultado.next()) {
                familia = new Familias();
                familia.setIdFamilia(resultado.getInt("id_familia"));
                familia.setNombre(resultado.getString("nombre"));
                familia.setEdadMin(resultado.getInt("edad_minima"));
                familia.setEdadMax(resultado.getInt("edad_maxima"));
                familia.setNumHijos(resultado.getInt("num_hijos"));
                familia.setIdCasaFamilia(resultado.getInt("id_casa_familia"));
                
                familias.add(familia);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return familias;
    }
    
    public List<Familias> masDe3HijosYmenoresDe10anios(){
        String query = "select nombre, num_hijos, edad_maxima from familias where num_hijos >= 3 and edad_maxima < 10";
        consultar(query);
        List<Familias> familias = new ArrayList<>();
        Familias familia;
        
        try{
            while(resultado.next()){
                familia = new Familias();
                familia.setNombre(resultado.getString("nombre"));
                familia.setNumHijos(resultado.getInt("num_hijos"));
                familia.setEdadMax(resultado.getInt("edad_maxima"));
                familias.add(familia);
            }
        } catch (SQLException ex){
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return familias;
    }
    
    public List<Familias> correoHotmail(){
        String query = "select * from familias";
        consultar(query);
        List<Familias> familias = new ArrayList<>();
        Familias familia;
        
        try {
            while (resultado.next()) {
                familia = new Familias();
                familia.setNombre(resultado.getString("nombre"));
                familia.setEmail(resultado.getString("email"));
                                
                familias.add(familia);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return familias;
    }
}
