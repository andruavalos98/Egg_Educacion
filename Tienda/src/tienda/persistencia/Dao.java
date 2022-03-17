/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author andru
 */
public class Dao {

    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultado;

    protected String nombreBaseDatos = "tienda";
    protected String usuario = "root";
    protected String contrasenhia = "root";
    protected String ipServidor = "localhost";
    protected String puerto = "3306";

    protected void conectarme() {
        try {
            String url = "jdbc:mysql://" + ipServidor + ":" + puerto + "/" + nombreBaseDatos + "?useSSL=false";
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasenhia);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontró el driver:" + ex.getMessage());
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("No se pudo hacer la conexion la base de datos.: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    protected void desconectarme() {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrió un error al desconectarse de la base de datos");
        }
    }

    protected void insertarActualizarOEliminar(String query) {
        conectarme();
        try {
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Ocurrió un error al crear la sentencia o al ejecutar la query: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            desconectarme();
        }
    }

    protected void consultar(String query) {
        conectarme();
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Ocurrió un error al crear la sentencia o al ejecutar la consulta: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
