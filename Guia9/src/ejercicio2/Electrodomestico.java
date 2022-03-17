/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author andru
 */
public class Electrodomestico {

    //ATRIBUTOS
    protected Double precio, peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;

        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        crearElectrodomestico(peso, color, consumoEnergetico);

    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void comprobarConsumoEnergetico(char letra) {

        if (letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F') {

            letra = 'F';
        }

    }

    public void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")) {

            color = "blanco";
        }
    }

    public void crearElectrodomestico(Double peso, String color, char letra) {

        this.peso = peso;
        this.precio = 1000.0;
        comprobarConsumoEnergetico(letra);
        comprobarColor(color);

    }

    public double precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        if (peso < 19) {
            this.precio += 100;
        } else if (peso < 49) {
            this.precio += 500;
        } else if (peso < 79) {
            this.precio += 800;
        } else if (peso > 80) {
            this.precio += 1000;
        }
        return precio;
    }

    @Override
    public String toString() {
        return " precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

}
