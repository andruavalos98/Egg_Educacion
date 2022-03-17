package ejercicio3.entidades;

import ejercicio3.entidades.enums.Numero;
import ejercicio3.entidades.enums.Palo;

public class Carta {

    private Palo palo;

    private Numero Numero;

  public Palo getPalo() {
    return palo;
  }

  public void setPalo(Palo palo) {
    this.palo = palo;
  }

  public Numero getNumero() {
    return Numero;
  }

  public void setNumero(Numero Numero) {
    this.Numero = Numero;
  }

  @Override
  public String toString() {
    return "Carta{" + "palo=" + palo + ", Numero=" + Numero + '}';
  }
}
