/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> listaArticulos = new HashMap();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;

        TiendaServicios tienda = new TiendaServicios();

        do {

            System.out.println("Que desea hacer?\n");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar lista de productos");
            System.out.println("5. Salir");

            op = leer.nextInt();

            Tienda art = new Tienda();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del articulo que desea agregar");
                    art.setArticulo(leer.next());
                    leer.nextLine();

                    System.out.println("Ingrese el precio del articulo");
                    art.setPrecio(leer.nextDouble());
//                    leer.nextDouble();

                    tienda.agregar(art.getArticulo(), art.getPrecio(), listaArticulos);

                    break;

                case 2:
                    System.out.println("Introduce el articulo que quieres cambiar el precio:");
                    art.setArticulo(leer.nextLine());
                    leer.nextLine();
                    tienda.modificarPrecio(art.getArticulo(), listaArticulos);

                    break;
                case 3:
                    System.out.println("Introduce el nombre del producto que quieres eliminar:");
                    art.setArticulo(leer.next());
                    leer.nextLine();
                    tienda.eliminarProducto(art.getArticulo(), listaArticulos);
                    break;
                case 4:
                    tienda.mostrarArticulos(listaArticulos);
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }

        } while (op != 5);

    }

}
