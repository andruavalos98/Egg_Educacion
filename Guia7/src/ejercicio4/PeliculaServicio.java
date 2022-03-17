/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class PeliculaServicio {

    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    Pelicula pelicula = new Pelicula();

    public void crearPelicula() {
        Scanner leer = new Scanner(System.in);

        Pelicula pelicula = new Pelicula();

        System.out.println("\nIngrese el titulo de la pelicula");
        pelicula.setTitulo(leer.next());
        leer.nextLine();

        System.out.println("Ingrese el director de la pelicula");
        pelicula.setDirector(leer.next());
        leer.nextLine();

        System.out.println("Ingrese la duracion en horas");
        pelicula.setDuracion(leer.nextDouble());
        leer.nextLine();

        System.out.println(" ");
        listaPeliculas.add(pelicula);

    }

    public void mostrarPeliculas() {

        for (Pelicula p : listaPeliculas) {

            System.out.println(p);

        }

    }

    public void ordenarMas1hora() {

        for (Pelicula pe : listaPeliculas) {

            if (pe.getDuracion() >= 1) {

                System.out.println("--------------------------------");
                System.out.println("Titulo: " + pe.getTitulo());
                System.out.println("Director: " + pe.getDirector());
                System.out.println("Duracion: " + pe.getDuracion());
                System.out.println("--------------------------------");

            }

        }

    }

    public void ordenarPorHora() {

        Collections.sort(listaPeliculas);

        mostrarPeliculas();

    }
    
    public void ordenarPorHora2(){
    
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return (int) ((int) t.getDuracion()-t1.getDuracion());
            }
        });
        
        mostrarPeliculas();
    
    }

    public void ordenarPorTitulo() {

        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
            }
        });

        mostrarPeliculas();

    }
    
    public void ordenarPorDirector() {

        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().compareTo(t1.getDirector());
            }
        });

        mostrarPeliculas();

    }

}
