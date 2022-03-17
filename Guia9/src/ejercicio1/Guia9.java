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
public class Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro ("Stich", "Carnivoro", "Doberman", 15);
        perro.Alimentarse();
        
        Animal perro1 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", "Siames", 15);
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", "Fino", 25);
        caballo.Alimentarse();
    }
    
    
}
