
package ejercicio3.servicios;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import java.util.Collections;
import java.util.Scanner;

/* @author Nahue
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
 */
public class BarajaServicio {
  
  private CartaServicio cartaServicio = new CartaServicio();
  private Scanner pepe = new Scanner(System.in).useDelimiter("\n");
  
  public Baraja crearBaraja() {
    Baraja baraja = new Baraja();
    Carta carta = null;
    for (int i = 0; i < baraja.getCANTIDAD_DE_CARTAS(); i++) {
      carta = cartaServicio.crearCarta(i);
      baraja.getCartas().add(carta);
    }
    return baraja;
  }

  public void barajar(Baraja baraja) {
    Collections.shuffle(baraja.getCartas());
  }
  
  public void siguienteCarta(Baraja baraja) {
    if (baraja.getCartas().isEmpty()) {
      System.out.println("No hay más cartas, el maso está vacío");
    } else {
      Carta carta = baraja.getCartas().get(0);
      System.out.println(carta.toString());
      baraja.getCartas().remove(carta);
      baraja.getMonton().add(carta);
    }
  }
  
  public void cartasDisponibles(Baraja baraja) {
    System.out.println("La cantidad de disponibles es: "+baraja.getCartas().size());
  }
  
  /*
  • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
  */
  public void darCartas(Baraja baraja) {
    System.out.println("Ingrese el número de cartas que quiere:");
    Integer cantidad = pepe.nextInt();
    if (cantidad > baraja.getCartas().size() ) {
      System.out.println("Lo siento no quedan tantas cartas en el mazo");
    } else {
      Carta carta = null;
      for (int i = 0; i < cantidad; i++) {
        siguienteCarta(baraja);
      }
    }
  }
  /*
  • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
 */
  
  public void mostrarMonton(Baraja baraja) {
    for (Carta carta : baraja.getMonton()) {
      System.out.println(carta.toString());
    }
  }
  
  public void mostrarBaraja(Baraja baraja) {
    for (Carta carta : baraja.getCartas()) {
      System.out.println(carta.toString());
    }
  }
}
