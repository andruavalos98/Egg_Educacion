/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        int[] arregloA = new int[50];
        int[] arregloB = new int[20];

        Arreglo.llenarA(arregloA);

        System.out.println(" ARREGLO A: \n ");

        Arreglo.mostrar(arregloA);
        System.out.println(" ");

        Arrays.sort(arregloA);
        System.out.println(" ");

        System.out.println(" ARREGLO A ORDENADO: \n ");

        Arreglo.mostrar(arregloA);

        Arreglo.llenarB(arregloA, arregloB);

        System.out.println(" ");

        System.out.println(" \n ARREGLO B:  ");
        System.out.println(" ");

        Arreglo.mostrar(arregloB);

    }

}
