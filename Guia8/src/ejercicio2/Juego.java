package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
        static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Jugador> jugadores = new ArrayList<>();
    RevolverDeAgua revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getListaJugadores() {
        return jugadores;
    }

    public void setListaJugadores(ArrayList<String> listaJugadores) {
        this.jugadores = jugadores;
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, RevolverDeAgua r){
       this.jugadores=jugadores;
       jugadores.get(0).setRevolver(r); 
       revolver = r;
                
    }
    
}
