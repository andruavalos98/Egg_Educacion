/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author andru
 */
public class Rectangulo {
    private double base, altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void superficie(){
    double sup;
    
    sup = base * altura;
    
        System.out.println("la superficie del rectangulo es: " + sup);
    
    }
    
    public void perimetro(){
    double per;
    
    per = (base + altura)*2;
    
        System.out.println("el perimetro es: " + per);
    
    }
    
    public void dibujar (){
    
    for (int i=0;i<base ; i++){
             for (int j=0; j<altura; j++){
                 if (i>=1 && i<base-1 && j>=1 && j<altura-1){
                     System.out.print(" ");
                 }else{
                     System.out.print("*");
                 }
             }
             System.out.println("");
         
         }
    }
    
}
