/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        Scanner leer = new Scanner(System.in);
        String op;

        do {

            Alumno alumno = new Alumno();
            System.out.println("--------------------------------");
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.nextLine());

            System.out.println("Ingrese las 3 notas del alumno");

            alumno.nota1 = leer.nextInt();
            alumno.nota2 = leer.nextInt();
            alumno.nota3 = leer.nextInt();

            leer.nextLine();

            listaAlumnos.add(alumno);

            System.out.println("Desea cargar otro alumno?");
            op = leer.next();
            leer.nextLine();

        } while (!op.equalsIgnoreCase("no"));

        for (Alumno n : listaAlumnos) {

            System.out.println(n);

        }

    }

}
