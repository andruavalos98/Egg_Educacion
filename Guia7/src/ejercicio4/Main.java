/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        PeliculaServicio peli = new PeliculaServicio();

        int op;

        do {

            System.out.println("\n Elija una opcion \n");

            System.out.println("1. Cargar pelicula");
            System.out.println("2. Mostrar en pantalla todas las películas.");
            System.out.println("3. Mostrar en pantalla todas las películas con una duración mayor a 1 hora.");
            System.out.println("4. Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.");
            System.out.println("5. Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.");
            System.out.println("6. Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("7. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("8. Salir \n");

            op = leer.nextInt();

            switch (op) {
                case 1:

                    peli.crearPelicula();

                    break;

                case 2:

                    peli.mostrarPeliculas();

                    break;

                case 3:
                    
                    peli.ordenarMas1hora();

                    break;

                case 4:
                    
                    peli.ordenarPorHora();

                    break;

                case 5:
                    
                    peli.ordenarPorHora2();

                    break;

                case 6:
                    
                    peli.ordenarPorTitulo();

                    break;

                case 7:
                    
                    peli.ordenarPorDirector();

                    break;

                default:

            }

        } while (op != 8);

    }

}
