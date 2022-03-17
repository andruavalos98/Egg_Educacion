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
public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, Double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;

        precioFinal();
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora(double peso, String color, char letra, Integer carga) {

        super.crearElectrodomestico(peso, color, letra);

        this.carga = carga;

    }

    @Override
    public double precioFinal() {
        this.precio = super.precioFinal();
        if (carga > 30) {
            this.precio += 500;
        }
        return precio;
    }

    @Override
    public String toString() {

        return "Lavadora [carga=" + carga + super.toString();
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    }

}
