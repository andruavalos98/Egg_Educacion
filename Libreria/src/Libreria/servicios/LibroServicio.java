/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.AutorDao;
import Libreria.persistencia.EditorialDao;
import Libreria.persistencia.LibroDao;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class LibroServicio {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private LibroDao ld = new LibroDao();

    public void guardarLibro() {
        AutorDao ad = new AutorDao();
        EditorialDao ed = new EditorialDao();
        Libro libro = new Libro();
        
        System.out.println("Ingrese el ISBN del libro");
        libro.setIsbn(sc.nextInt());
        System.out.print("Ingrese el titulo del libro");
        libro.setTitulo(sc.next());
        System.out.println("Ingrese el año de publicacion del libro");
        libro.setAnio(sc.nextInt());
        System.out.println("Ingrese el numero de ejemplares actuales");
        libro.setEjemplares(sc.nextInt());
        System.out.println("Ingrese el numero de ejemplares prestados");
        libro.setEjemplaresPrestados(sc.nextInt());
        libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
        
        if (libro.getEjemplaresRestantes()>0){
            System.out.println("Numero de ejemplares restantes: " + libro.getEjemplaresRestantes());
        } else {
            libro.setAlta(false);
            System.out.println("No hay libros en existencia, libro " + libro.getTitulo() + "dado de baja");
        }
        
        

        System.out.println("Ingrese el id del autor del libro");
        for (Autor autor : ad.buscarAutoresPorID(sc.nextInt())) {
            libro.setAutor(autor);
        }

        System.out.println("Ingrese el id de la Editorial");
        for (Editorial editorial : ed.buscarEditoralesPorID(sc.nextInt())) {
            libro.setEditorial(editorial);
        }
    }

    public void busquedaLibroPorEditorial() {
        EditorialDao ed = new EditorialDao();
        Libro libro = new Libro();

        System.out.println("Ingrese el nombre de la editorial a buscar");
        for (Editorial editorial : ed.buscarEditorialPorNombre(sc.next())) {
            libro.setEditorial(editorial);
        }

    }

    public void busquedaLibroPorAutor() {
        AutorDao ad = new AutorDao();
        Libro libro = new Libro();

        System.out.println("Ingrese el nombre del autor a buscar");
        for (Autor a : ad.buscarAutores(sc.next())) {
            libro.setAutor(a);
        }

    }

}
