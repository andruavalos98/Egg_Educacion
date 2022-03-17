/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    float cantMax, cantActual = 0, agrega;

    public Cafetera() {
    }

    public Cafetera(float cantMax, float cantActual) {
        this.cantMax = cantMax;
        this.cantActual = cantActual;
    }

    public float getCantMax() {
        return cantMax;
    }

    public void setCantMax(float cantMax) {
        this.cantMax = cantMax;
    }

    public float getCantActual() {
        return cantActual;
    }

    public void setCantActual(float cantActual) {
        this.cantActual = cantActual;
    }

    public void inicio() {

        System.out.println("ingrese la capacidad maxima de la cafetera");
        cantMax = leer.nextFloat();

    }

    public void llenarCafetera() {

        cantActual = cantMax;
        System.out.println("LA CAFETERA CONTIENE: " + cantActual + "Y SU CAPACIDAD MAXIMA ES: " + cantMax);

    }

    public void servirTaza(int taza) {

        cantActual = cantActual - taza;

        if (cantActual < 0) {
            cantActual = 0;
            System.out.println("LA CAFETERA ESTA VACIA");

        } else {

            System.out.println("LA CANTIDAD QUE QUEDA EN LA CAFETERA ES: " + cantActual);

        }

    }
    
    public void agregarCafe(){
    
        System.out.println("ingrese la cantidad que desea agregar");
        agrega = leer.nextFloat();
        
        cantActual = cantActual + agrega;
        
        System.out.println("CANTIDAD ACTUAL: " + cantActual);
    
    
    }
}
