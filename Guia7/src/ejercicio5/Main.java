/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PaisesServicios pais = new PaisesServicios();
        int op;
        
        do{
            System.out.println("Que desea hacer?\n");
            System.out.println("1. Agregar pais");
            System.out.println("2. Mostrar lista de paises");
            System.out.println("3. Mostrar por orden alfabetico");
            System.out.println("4. Eliminar un pais");
            System.out.println("5. Salir");
            
            op = leer.nextInt();
            
        
        switch(op){
            case 1:
                pais.agregar();
                break;
                
            case 2:
                pais.mostrar();
                break;
                
            case 3:
                pais.mostarOrden();
                break;
                
            case 4:
                pais.eliminar();
                
            default:
                System.out.println("Ingrese una opcion valida");
                break;
                   
        }
        
        
        }while(op!=5);

    }

}
