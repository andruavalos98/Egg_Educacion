package ejercicio2;

public class RevolverDeAgua {

    //ATRIBUTOS
    private final Integer TAMANIO_TAMBOR = 6;
    private Integer posicionActual, posicionAgua;

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        if (posicionActual >= 0 || posicionActual < 6) {
            this.posicionActual = posicionActual;
        } else {
            this.posicionActual = posicionActual%TAMANIO_TAMBOR;

        }
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + "\nposicionAgua=" + posicionAgua + '}';
    }

}
