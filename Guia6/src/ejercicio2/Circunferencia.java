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
public class Circunferencia {

    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public void area (int radio){
    
        double area;
        
        area = 3.14 * radio * radio;
        
        System.out.println("el area es: " + area);
    
    }
    
    public void perimetro (int radio){
    
        double per;
        
        per = 2 * 3.14 * radio;
        
        System.out.println("el perimetro es: " + per);
    
    }

}
