/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        int op, taza;

        cafe.inicio();

        do {
            System.out.println("--------------- \n");
            System.out.println("Que desea hacer? \n");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");

            op = leer.nextInt();

            switch (op) {

                case 1:

                    cafe.llenarCafetera();
                    break;

                case 2:
                    System.out.println("Ingrese la capacidad de la taza");
                    taza = leer.nextInt();
                    cafe.servirTaza(taza);
                    break;

                case 3:
                    cafe.setCantActual(0);
                    System.out.println("LA CAFETERA EST VACIA ");
                    System.out.println("Cantidad actual: " + cafe.getCantActual());
                    break;

                case 4:
                    cafe.agregarCafe();
                    break;

                case 5:
                    return;

            }

        } while (op != 5);
    }

}
