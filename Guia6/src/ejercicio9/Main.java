/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author andru
 */
public class Main {
    public static void main(String[] args) {
        int n1,n2;
        
        n1 = (int)(Math.random()*100);
        n2 = (int)(Math.random()*100);
        
        System.out.println("los numeros son: " + n1 + " y " + n2);
        
        Matematica mat = new Matematica(n1, n2);
        
//        mat.nro1 = (int)(Math.random()*10);
//        mat.nro2 = (int)(Math.random()*10);

    mat.devolverMayor();
    
    mat.calcularPotencia();
    
    mat.calculaRaiz();

    }
    
}
