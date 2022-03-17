/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Clientes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andru
 */
public class ClientesDao extends Dao {

    public List<Clientes> listAll() {
        String query = "select * from clientes";
        consultar(query);
        List<Clientes> clientes = new ArrayList<>();
        Clientes cliente;

        try {
            while (resultado.next()) {
                cliente = new Clientes();
                cliente.setIdCliente(resultado.getInt("id_cliente"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setCalle(resultado.getString("calle"));
                cliente.setNumero(resultado.getInt("numero"));
                cliente.setCodigoPostal(resultado.getString("codigo_postal"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setPais(resultado.getString("pais"));
                cliente.setEmail(resultado.getString("email"));

                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return clientes;

    }

}
