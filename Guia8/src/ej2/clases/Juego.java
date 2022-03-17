/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.clases;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    
    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, RevolverDeAgua r){
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public void ronda(){
        boolean termina = false;
        do {            
            for (Jugador aux : jugadores) {
                aux.disparo(r);
                if(aux.isMojado() == true){
                    System.out.println(aux);
                    termina = true;
                    break;
                }
            }
        } while (termina == false);
    }
}
