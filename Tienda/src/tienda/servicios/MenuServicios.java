/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class MenuServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int op;

    ProductoServicios productoServicios = new ProductoServicios();
    FabricanteServicios fabricanteServicios = new FabricanteServicios();

    public void menu() {

        do {
            System.out.println("Que desea hacer?");

            System.out.println("1. Lista de todos los productos");
            System.out.println("2. Lista los nombres y precios de todo los productos");
            System.out.println("3. Listar productos que su precio este entre 120 y 202");
            System.out.println("4. Buscar y listar todos los Portátiles");
            System.out.println("5. Listar el nombre y el precio del producto más barato");
            System.out.println("6. Ingresar un producto a la base de datos");
            System.out.println("7. Ingresar un fabricante a la base de datos");
            System.out.println("8. Editar un producto con datos a elección");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    productoServicios.mostrarTodosLosProductos();
                    break;

                case 2:
                    productoServicios.mostrarNombreYPrecio();
                    break;

                case 3:
                    productoServicios.mostrarEntre120Y202();
                    break;

                case 4:
                    productoServicios.mostrarPortatiles();
                    break;

                case 5:
                    productoServicios.mostrarMasBarato();
                    break;

                case 6:
                    productoServicios.insertarNuevoProducto();
                    break;

                case 7:
                    fabricanteServicios.ingresarFabricante();

                    break;

                case 8:
                    productoServicios.editarProducto();
                    break;

                default:
                    break;

            }

        } while (op != 9);
    }

}
