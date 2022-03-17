/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext_ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author andru
 */
abstract class Barcos {

    protected String matricula;
    protected int eslora, anioFabricacion;
    protected double alquiler;

    public Barcos() {
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    

}
