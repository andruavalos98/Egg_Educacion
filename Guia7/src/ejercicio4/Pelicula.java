/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Comparator;

/**
 *
 * @author andru
 */
public class Pelicula implements Comparable<Pelicula> , Comparator<Pelicula>
 {
    private String titulo, director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "--------\n" + "Titulo: " + titulo + "\nDirector: " + director + "\nDuracion: " + duracion + "\n--------";
    }

    @Override
    public int compareTo(Pelicula t) {
        return (-1)*(int) (duracion-t.duracion);
    }

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
