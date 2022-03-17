/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author andru
 */
public class main {
    public static void main(String[] args) {
        Circunferencia cir = new Circunferencia ();
        
        int radio = 6;
        
        cir.setRadio(radio);
        
        cir.area(radio);
        cir.perimetro(radio); 
    }
    
}
