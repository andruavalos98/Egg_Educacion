/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author andru
 */
public class Main {
    public static void main(String[] args) {
        //aqui se pasan los valores
        Operacion op = new Operacion(9,7);
        
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
    }
    
}
