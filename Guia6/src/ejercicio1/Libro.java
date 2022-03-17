/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Libro {
    public String titulo, autor;
    public int nroPag, ISBN;

    public Libro(int ISBN, String titulo, String autor, int nroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

    public Libro() {
    }
    
    public void cargarLibro (){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN");
        ISBN = leer.nextInt();
        
        System.out.println("Ingrese el titulo");
        titulo = leer.next();
        
        System.out.println("Ingrese el autor");
        autor = leer.next();
        
        System.out.println("Ingrese el nro de paginas");
        nroPag = leer.nextInt();
        
        
    }
    
    public void mostrar (){
    
        System.out.println(ISBN);
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(nroPag);
    
    }
    
}
