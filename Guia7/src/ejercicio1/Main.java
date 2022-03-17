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
        Scanner leer = new Scanner(System.in);
        String raza, op, buscar;
        boolean resultado = false;
        // TODO code application logic here
        ArrayList<String> razasPerro = new ArrayList<>();

        do {
            System.out.println("Ingrese una raza de perro");
            raza = leer.next();

            razasPerro.add(raza);

            System.out.println("Desea seguir ingresando razas de perro? SI O NO");
            op = leer.next();

        } while (!op.equalsIgnoreCase("no"));

        for (String ra : razasPerro) {

            System.out.println(ra);

        }

        //PUNTO 2
        System.out.println("Ingrese una raza para buscarla y eliminrla");
        buscar = leer.next();

        resultado = (razasPerro.contains(buscar) ? razasPerro.remove(buscar) : false);

        if (resultado == false) {
            System.out.println("no se encontro");

        } else {

            for (String mostrar : razasPerro) {

                System.out.println(mostrar);

            }
        }
    }

}
