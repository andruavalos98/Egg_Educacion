
package ejercicio3.servicios;

import ejercicio3.entidades.Baraja;
import java.util.Scanner;

/* @author Nahue
 */
public class MenuServicio {

  private Scanner pepe = new Scanner(System.in).useDelimiter("\n");

  private BarajaServicio barajaServicio = new BarajaServicio();
  public void run() {
    Baraja baraja = barajaServicio.crearBaraja();
    do {      
      System.out.println("\nMenu de baraja");
    
      System.out.println("1- Barajar");
      System.out.println("2- Siguiente Carta");
      System.out.println("3- Cartas Disponibles");
      System.out.println("4- Dar cartas");
      System.out.println("5- Montón");
      System.out.println("6- Cartas");
      
      switch (pepe.nextInt()) {
        case 1:
          barajaServicio.barajar(baraja);
          break;
        case 2:
          barajaServicio.siguienteCarta(baraja);
          break;
        case 3:
          barajaServicio.cartasDisponibles(baraja);
          break;
        case 4:
          barajaServicio.darCartas(baraja);
          break;
        case 5:
          barajaServicio.mostrarMonton(baraja);
          break;
        case 6:
          barajaServicio.mostrarBaraja(baraja);
          break;
        default:
          System.out.println("No hay ninguna opcion para ese número");
      }
    } while (true);
    
    
    
  }
}
