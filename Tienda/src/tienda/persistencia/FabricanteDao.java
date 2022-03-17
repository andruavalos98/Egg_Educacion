/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.List;
import tienda.entidades.Fabricante;


/**
 *
 * @author andru
 */
public class FabricanteDao extends Dao{
    
    public List<Fabricante> listAll(){
        return null;
    }
    
    public void ingresarFabricante(Fabricante fabricantes) {
        String query = "INSERT INTO fabricante VALUES(default, '" + fabricantes.getNombre() + "')";

        insertarActualizarOEliminar(query);

    }
}
