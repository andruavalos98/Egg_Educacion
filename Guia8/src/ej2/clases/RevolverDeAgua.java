/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.clases;

/**
 *
 * @author Lucas
 */
public class RevolverDeAgua {
    private int posicionActual, posicionAgua;

    public RevolverDeAgua() {
        posicionActual = (int)(Math.random()*10);
        posicionAgua = (int)(Math.random()*10);
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        posicionActual = (int)(Math.random()*10);
        posicionAgua = (int)(Math.random()*10);
    }
    
    public boolean mojar(){
        if (posicionActual == posicionAgua){
            return true;
        }else{
            return false;
        }
    }
    
    public void siguienteChorro(){
        if(posicionActual == 10){
            posicionActual = 0;
        }else{
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual:" + posicionActual + ", posicionAgua:" + posicionAgua + '}';
    }
}
