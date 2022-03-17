package ejercicio3.entidades;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;
    private List<Carta> monton;

    private final Integer CANTIDAD_DE_CARTAS;

  public Baraja() {
    cartas = new ArrayList<>();
    CANTIDAD_DE_CARTAS = 40;
  }
    
    

  public List<Carta> getCartas() {
    return cartas;
  }

  public void setCartas(List<Carta> cartas) {
    this.cartas = cartas;
  }

  public Integer getCANTIDAD_DE_CARTAS() {
    return CANTIDAD_DE_CARTAS;
  }

  public List<Carta> getMonton() {
    return monton;
  }

  public void setMonton(List<Carta> monton) {
    this.monton = monton;
  }

    
}
