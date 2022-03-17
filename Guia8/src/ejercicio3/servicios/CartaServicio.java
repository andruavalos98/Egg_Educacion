
package ejercicio3.servicios;

import ejercicio3.entidades.Carta;
import ejercicio3.entidades.enums.Numero;
import ejercicio3.entidades.enums.Palo;

/* @author Nahue
 */
public class CartaServicio {

  // operacion del modulo "%"
  public Carta crearCarta(Integer indice) {
    Carta carta = new Carta();
    Palo[] palos = Palo.values();
    carta.setPalo(palos[indice % 4]);
    carta.setNumero(Numero.values()[indice / 4]);
    return carta;
  }
  
  //BASTO, ESPADA, ORO, COPAS
  
  // indice = 0 => [indice % 4] = 0 y [indice % 9] = 0 => BASTO N1
  // ESPADA N2
  // ORO N3
  // COPAS N4
  // 
   //indice = 4 => [indice % 4] = 0 y [indice % 9] = 4
  
  // indice = 0 => [indice % 4] = 0 y [indice / 4] = 0 => BASTO N1
  // indice = 1 => [indice % 4] = 1 y [indice / 4] = 0 => BASTO N1
  // indice = 2 => [indice % 4] = 2 y [indice / 4] = 0 => BASTO N1
  // indice = 3 => [indice % 4] = 3 y [indice / 4] = 0 => BASTO N1
  // indice = 4 => [indice % 4] = 0 y [indice / 4] = 1 => BASTO N1
  
}
