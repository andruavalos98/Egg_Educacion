/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class MenuServicios {
        private Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();


    
    public void menu (){
        
        int op;
        do {         
            System.out.println("----- Libros -----");
            System.out.println("1. Ingresar libro nuevo");
            System.out.println("");
            System.out.println("---- Editoriales ----");
            System.out.println("2. Ingresar editorial nueva"); 
            System.out.println("");
            System.out.println("---- Autores ----");
            System.out.println("3. Ingresar un autor nuevo");
            System.out.println("");
            System.out.println("----- LIBRERIA -----");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Buscar autor por nombre");
            System.out.println("6. Buscar un libro por ISBN");
            System.out.println("7. Buscar un libro por titulo");
            System.out.println("8. Buscar un libro por nombre de autor");
            System.out.println("9. Buscar un libro por nombre de editorial");
            
            op = sc.nextInt();
            
            switch(op){
                
                case 1:
                    ls.guardarLibro();
                    break;
                case 2:
                    es.guardarEditorial();
                    break;
                case 3:
                    as.guardarAutor();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (op!=8);
    }
    
}
