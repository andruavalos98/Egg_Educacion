/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

/**
 *
 * @author andru
 */
public class ProductoDao extends Dao {

    public List<Producto> listAll() {

        String query = "select * from producto";
        consultar(query);
        List<Producto> productos = new ArrayList<>();
        Producto producto;

        try {
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));

                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return productos;
    }

    public List<Producto> nombreYprecio() {
        String query = "select nombre, precio from producto";
        consultar(query);
        List<Producto> productos = new ArrayList<>();
        Producto producto;
        try {
            while (resultado.next()) {
                producto = new Producto();
                producto.setPrecio(resultado.getInt("precio"));
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return productos;

    }

    public List<Producto> nombreYprecioEntre120y202() {
        String query = "select nombre, precio from producto where precio > 120 and precio < 202";
        consultar(query);
        List<Producto> productos = new ArrayList<>();
        Producto producto;
        try {
            while (resultado.next()) {
                producto = new Producto();
                producto.setPrecio(resultado.getInt("precio"));
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return productos;

    }

    public List<Producto> portatiles() {
        String query = "select nombre, precio from producto where nombre like '%Portátil%'";
        consultar(query);
        List<Producto> productos = new ArrayList<>();
        Producto producto;
        try {
            while (resultado.next()) {
                producto = new Producto();
                producto.setPrecio(resultado.getInt("precio"));
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return productos;

    }

    public List<Producto> elMasBarato() {
        String query = "select * from producto where precio = (select min(precio) from producto)";
        consultar(query);
        List<Producto> productos = new ArrayList<>();
        Producto producto;
        try {
            while (resultado.next()) {
                producto = new Producto();
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return productos;

    }

    public void insertarNuevoProducto(Producto producto) {
        String query = "INSERT INTO producto VALUES(default, '" + producto.getNombre() + "', 86.99, 5)";

        insertarActualizarOEliminar(query);

    }

    public void editarProducto(Producto producto) {
        String query = "update producto set nombre = '" + producto.getNombre() + "' where codigo = '" + producto.getCodigo() + "'";

        insertarActualizarOEliminar(query);

    }

}
