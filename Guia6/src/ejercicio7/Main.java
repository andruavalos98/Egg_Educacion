/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;


/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        

        Persona persona1 = new Persona("Pepi", "M", 22, 87, 1.81);
        Persona persona2 = new Persona("Andrea", "F", 22, 83, 1.60);
        Persona persona3 = new Persona("Franco", "M", 20, 90, 1.90);
        Persona persona4 = new Persona("Negra", "F", 8, 20, 1.20);
        
        
        
//        persona1.mostrarStats();
//        persona2.mostrarStats();
//        persona3.mostrarStats();
//        persona4.mostrarStats();
        
        //EJERCICIO 1 DE LA GUIA 10
        
        Persona persona5 = null;
        try {
            persona5.esMayorDeEdad();
        } catch (Exception e) {
            System.out.println("No existe persona5 tarao");
        }

    }

}
