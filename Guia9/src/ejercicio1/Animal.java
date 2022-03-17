/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author andru
 */
public class Animal {
    protected String nombre, alimento, raza;
    protected Integer edad;

    public Animal(String nombre, String alimento, String raza, Integer edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    public void Alimentarse() {
        System.out.println(nombre +" "+ edad + " se esta alimentando con " + alimento);
    }

    
    
    
    
    
}
