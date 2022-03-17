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
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizador, Double precio, Double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        
        precioFinal();
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor(double peso, String color, char letra, double resolucion,
            boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        super.crearElectrodomestico(peso, color, letra);
    }

    @Override
    public double precioFinal() {
        this.precio = super.precio;
        if (resolucion > 40) {
            this.precio = precio * 1.3;
        }
        if (sintonizador) {
            precio += 500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + super.toString();
    }
    
    
    
    public void mostrar(){
        System.out.println(this.toString());
    }

}
