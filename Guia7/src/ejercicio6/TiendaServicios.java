/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class TiendaServicios {

    Scanner leer = new Scanner(System.in);

    public void agregar(String articulo, Double precio, HashMap<String, Double> listaArticulos) {

        if (listaArticulos.containsKey(articulo)) {
            System.out.println("No se puede introducir el producto. El articulo esta repetido.");
        } else {
            listaArticulos.put(articulo, precio);
        }

    }

    public void modificarPrecio(String articulo, HashMap<String, Double> listaArticulos) {

        if (listaArticulos.containsKey(articulo)) {
            System.out.println("Introduce el precio del producto:");
            listaArticulos.put(articulo, leer.nextDouble());
        } else {
            System.out.println("No hay ningun articulo con ese nombre.");
        }

    }

    public void eliminarProducto(String articulo, HashMap<String, Double> listaArticulos) {
        Tienda art = new Tienda();

        if (listaArticulos.containsKey(articulo)) {
            listaArticulos.remove(articulo);
        } else {
            System.out.println("No hay ningun articulo con ese nombre.");
        }

    }

    public void mostrarArticulos(HashMap<String, Double> listaArticulos) {

        Iterator iterador = listaArticulos.entrySet().iterator();
        //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
        Map.Entry articulo;
        while (iterador.hasNext()) {
            articulo = (Map.Entry) iterador.next();
            //producto = iterador.next(); Si se usase tambien la otra linea comentada.
            System.out.println(articulo.getKey() + " - " + articulo.getValue());
        }

    }

}
