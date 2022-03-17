/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDao;
import tienda.persistencia.ProductoDao;

/**
 *
 * @author andru
 */
public class ProductoServicios {
    
    private ProductoDao productoDao = new ProductoDao();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarTodosLosProductos() {
        List<Producto> productos = productoDao.listAll();
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }
    
    public void mostrarNombreYPrecio() {
        List<Producto> productos = productoDao.nombreYprecio();
        for (Producto producto : productos) {
            System.out.println("-----------" + "\nNombre = " + producto.getNombre() + "\nPrecio = " + producto.getPrecio());
        }
        
    }
    
    public void mostrarEntre120Y202() {
        List<Producto> productos = productoDao.nombreYprecioEntre120y202();
        for (Producto producto : productos) {
            System.out.println("-----------" + "\nNombre = " + producto.getNombre() + "\nPrecio = " + producto.getPrecio());
        }
        
    }
    
    public void mostrarPortatiles() {
        List<Producto> productos = productoDao.portatiles();
        for (Producto producto : productos) {
            System.out.println("-----------" + "\nNombre = " + producto.getNombre() + "\nPrecio = " + producto.getPrecio());
        }
        
    }
    
    public void mostrarMasBarato() {
        List<Producto> productos = productoDao.elMasBarato();
        for (Producto producto : productos) {
            System.out.println("-----------" + "\nNombre = " + producto.getNombre() + "\nPrecio = " + producto.getPrecio());
        }
        
    }
    
    public void insertarNuevoProducto() {
        Producto producto = new Producto();
        System.out.println("Por favor ingrese un nombre");
        producto.setNombre(leer.next());
        productoDao.insertarNuevoProducto(producto);
        
    }
    
    public void editarProducto() {
        Producto producto = new Producto();
        System.out.println("Ingrese el codigo del producto que desea cambiar el nombre");
        producto.setCodigo(leer.nextInt());
        productoDao.editarProducto(producto);
        System.out.println("Por favor cambie el nombre");
        producto.setNombre(leer.next());
        productoDao.editarProducto(producto);
        
    }
    
}
