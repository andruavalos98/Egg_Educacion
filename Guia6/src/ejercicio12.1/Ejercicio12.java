/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12;

import java.util.Scanner;
/**
 *
 * @author carop
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
//Implemente la clase Persona. Una persona tiene un nombre y una fecha de
//nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
//siguientes métodos:
//Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
        Persona persona = Persona.crearPersona();
        System.out.println("La persona ingresada tiene: " + persona.calcularEdad() + " años");
        
        System.out.println("Ingrese la edad de otra persona para comparar si la anterior es menor");
        if(persona.menorQue(s.nextInt()))
            System.out.println("La persona es menor a la edad ingresada por parámetro");
        else
            System.out.println("La persona no es menor a la edad ingresada por parámetro");
        System.out.println(" ");
        persona.MostrarPersona();
    }
    
}
