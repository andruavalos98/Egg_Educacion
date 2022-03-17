/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class PaisesServicios {

    Scanner leer = new Scanner(System.in);
    ArrayList<Paises> listaPaises = new ArrayList<>();
    Paises pais = new Paises();

    public void agregar() {

        System.out.println("Ingrese el nombre del pais");

        pais.setNombre(leer.next());
        leer.nextLine();

    }

    public void mostrar() {

        for (Paises p:  listaPaises) {
            System.out.println(p);
            System.out.println("888");
        }
    }
    
    public void mostarOrden(){
    
        Collections.sort(listaPaises, new Comparator<Paises>() {
            @Override
            public int compare(Paises t, Paises t1) {
                return t.getNombre().compareTo(t1.getNombre());
            }
        });
        
        mostrar();
    
    }
    
    public void eliminar(){
    
        System.out.println("Ingrese el nombre del pais que desea eliminar");
        pais.setNombre(leer.next());
        
        listaPaises.remove(pais);
    
    }
}
