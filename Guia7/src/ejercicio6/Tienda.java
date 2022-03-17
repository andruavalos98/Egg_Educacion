/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;



/**
 *
 * @author andru
 */
public class Tienda {
    String articulo;
    double precio;

    public Tienda() {
    }

    public Tienda(String articulo, double precio) {
        this.articulo = articulo;
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "articulo=" + articulo + ", precio=" + precio + '}';
    }
    
    
}
