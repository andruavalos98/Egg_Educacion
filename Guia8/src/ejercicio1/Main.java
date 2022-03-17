/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <Perro> listaPerros = new ArrayList<>();
        ArrayList <Persona> listaPersonas = new ArrayList<>();
        
        AdopcionServicio servicio = new AdopcionServicio();

        int op;

        do {

            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Cargar perros");
            System.out.println("2. Cargar Persona");
            System.out.println("3. Mostrar listado");
            System.out.println("4. Salir");
            System.out.print("INGRESE OPCION: ");

            op = leer.nextInt();

            switch (op) {

                case 1:
                    AdopcionServicio.cargarPerros(listaPerros);
                    break;

                case 2:
                    AdopcionServicio.cargarPersona(listaPerros, listaPersonas);
                    break;

                case 3:
                    AdopcionServicio.mostrarListado(listaPersonas);
                    break;


                default:
                    break;

            }

        } while (op != 4);

    }

}
