package ejercicio2;

import static ejercicio2.Juego.leer;

public class Main {

    public static void main(String[] args) {
         Jugador jugador = new Jugador();
         Juego juego = new Juego();
         
        
        System.out.println("Ingrese el nombre del jugador");
        jugador.setNombre(leer.next());
        
        System.out.println("Ingrese el ID del jugador");
        jugador.setId(leer.nextInt());
        
        
        
    }
}
