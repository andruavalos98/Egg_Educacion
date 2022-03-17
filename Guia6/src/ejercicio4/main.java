/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author andru
 */
public class main {
    public static void main(String[] args) {
        // ingreso de altura y base
        Rectangulo rect = new Rectangulo(5,3);
        
        rect.superficie();
        rect.perimetro();
        
        rect.dibujar();
    }
}
