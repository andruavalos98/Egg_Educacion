/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<>();
        Double precioE = 0.0;

        Lavadora lavadora = new Lavadora(30, (double) 2000, (double) 40, "rojo", 'A');
        lista.add(lavadora);

        Lavadora lavadora2 = new Lavadora(20, (double) 3000, (double) 50, "azul", 'C');
        lista.add(lavadora2);

        Electrodomestico tele = new Televisor((double) 1080, false, 60.0, 56.7, "blanco", 'A');
        lista.add(tele);

        Electrodomestico tele2 = new Televisor((double) 720, true, 60.0, 56.7, "negro", 'F');
        lista.add(tele2);

        lista.forEach((aparato) -> {
            System.out.println(aparato);
        });

        for (Electrodomestico precio : lista) {
            precioE += precio.getPrecio();
        }
        
        System.out.println("PRECIO TOTAL");
        
        System.out.println(precioE);

    }

}
