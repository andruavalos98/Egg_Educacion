/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author andru
 */
public class Arreglo {
    
    public static void llenarA(int[] arreglo){
        
     for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random()*10);
           
        }
    }
    

    
    public static void mostrar(int[] arreglo){
        
    
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
    
    
    }
    
    public static void llenarB(int[] arreglo1, int[] arreglo2){
    
        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        
        for (int i = 11; i < 20; i++) {
            arreglo2[i] = 0;
        }
    
    
    } 
    
    
}
