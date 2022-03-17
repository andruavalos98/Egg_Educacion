/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nahue
 */
public class Guia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection conexion;
        Statement sentencia;
        ResultSet resultado;
        
        String nombreBaseDatos = "personal";
        String usuario = "root";
        String contrasenhia = "root";
        String ipServidor = "localhost";
        String puerto = "3306";
        
        String url = "jdbc:mysql://"+ipServidor+":"+puerto+"/"+nombreBaseDatos+"?useSSL=false";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasenhia);
            
            sentencia = conexion.createStatement();
            
            String query = "select * from empleados";
            
            resultado = sentencia.executeQuery(query);
            
            while (resultado.next()) {
                System.out.println("Empleado: id: "+resultado.getInt("id_emp")+", nombre: "+resultado.getString("nombre"));
            }
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("No se encontró el driver:"+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("No se pudo hacer la conexion la base de datos.: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
