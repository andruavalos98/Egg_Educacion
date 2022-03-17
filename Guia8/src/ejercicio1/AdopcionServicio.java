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
public class AdopcionServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //LISTAS
    ArrayList<Perro> listaPerros = new ArrayList<>();
    ArrayList<Persona> listaPersonas = new ArrayList<>();

    public static Perro menuPerros(ArrayList<Perro> listadoPerros) {

        if (listadoPerros.isEmpty()) {
            System.out.println("NO HAY PERROS CARGADOS EN EL SISTEMA");
        } else {
            System.out.println("-------------------------");
            System.out.println("PERROS DISPONIBLES");
            int i = 1;

            for (Perro listadoPerro : listadoPerros) {
                System.out.println(i + " - " + listadoPerro.toString());
                i++;
            }
            System.out.println("SELECCIONE: ");
            int op = leer.nextInt();

            Perro perro1 = listadoPerros.get(op - 1);
            listadoPerros.remove(op - 1);
            return perro1;
        }

        return null;

    }

    public static void cargarPerros(ArrayList<Perro> listadoPerros) {
        Perro perro = new Perro();
        System.out.print("INGRESE NOMBRE: ");
        perro.setNombre(leer.next());
        leer.next();

        System.out.print("INGRESE RAZA: ");
        perro.setRaza(leer.next());

        System.out.print("INGRESE EDAD: ");
        perro.setEdad(leer.nextInt());

        System.out.print("INGRESE TAMAÑO: ");
        perro.setTamanio(leer.next());
        

        listadoPerros.add(perro);
    }

    public static void cargarPersona(ArrayList<Perro> listadoPerros, ArrayList<Persona> listadoPersonas) {

        Persona per = new Persona();

        System.out.print("INGRESE NOMBRE: ");
        per.setNombre(leer.next());

        System.out.print("INGRESE APELLIDO: ");
        per.setApellido(leer.next());
        leer.next();

        System.out.print("INGRESE EDAD: ");
        per.setEdad(leer.nextInt());

        System.out.print("INGRESE DNI: ");
        per.setDocumento(leer.nextInt());

        per.setPerro(menuPerros(listadoPerros));

        listadoPersonas.add(per);

    }

    public static void mostrarListado(ArrayList<Persona> listadoPersona) {

        System.out.println("-------------LISTADO--------------");

        for (Persona per : listadoPersona) {
            System.out.println(per.toString());
        }
    }

}
