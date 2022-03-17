/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.persistencia.AutorDao;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class AutorServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private AutorDao ad = new AutorDao();
    int i = 1;

    public void guardarAutor() {
        Autor autor = new Autor();
        
        
        autor.setId(i);
        i++;
        
        System.out.println("Ingrese el nombre del autor");
        autor.setNombre(leer.next());
        
        autor.setAlta(true);

        ad.guardar(autor);
    }
    
    public void buscarAutorPorNombre(){
        
        System.out.println("Ingrese el nombre del autor a buscar");
        for (Autor buscarAutore : ad.buscarAutores(leer.next())) {
            System.out.println(buscarAutore.toString());
        }
      
    }

}
