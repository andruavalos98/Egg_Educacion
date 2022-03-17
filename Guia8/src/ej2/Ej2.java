/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import ej2.clases.Juego;
import ej2.clases.Jugador;
import ej2.clases.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos jugadores van a jugar (entre 1 a 6 jugadores)");
        int jug = sc.nextInt();
        if(jug < 1 || jug > 6){
            jug = 6;
        }
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 0; i < jug; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i+1));
            Jugador j1 = new Jugador(i+1, sc.next());
            jugadores.add(j1);
        }
        RevolverDeAgua r = new RevolverDeAgua();
        Juego j1 = new Juego(jugadores, r);
        j1.ronda();
    }
    
}
