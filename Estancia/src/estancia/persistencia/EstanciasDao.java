/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Estancias;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andru
 */
public class EstanciasDao extends Dao {
    
     public List<Estancias> listAll() {

        String query = "select * from estancias";
        consultar(query);
        List<Estancias> estancias = new ArrayList<>();
        Estancias estancia;

        try {
            while (resultado.next()) {
                estancia = new Estancias();
                estancia.setIdEstancia(resultado.getInt("id_estancia"));
                estancia.setIdCliente(resultado.getInt("id_cliente"));
                estancia.setIdCasa(resultado.getInt("id_casa"));
                estancia.setNombreHuesped(resultado.getString("nombre_huesped"));
                estancia.setFechaDesde(resultado.getDate("fecha_desde"));
                estancia.setFechaHasta(resultado.getDate("fecha_hasta"));

                estancias.add(estancia);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return estancias;
    }
    
}
