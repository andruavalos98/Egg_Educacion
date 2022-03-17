/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author andru
 */
public class Operacion {

    private int numero1, numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void sumar() {
        int suma;

        suma = numero1 + numero2;

        System.out.println("la suma es: " + suma);

    }

    public void restar() {
        int resta;

        resta = numero1 - numero2;
        System.out.println("la resta es: " + resta);

    }

    public void multiplicar() {
        double mult;

        if (numero1 == 0 || numero2 == 0) {

            mult = 0;
            System.out.println("ERROR. Multiplicacion por cero" + mult);

        } else {
            mult = numero1 * numero2;
            System.out.println("la multiplicacion es: " + mult);
        }

    }
    
    public void dividir (){
     double div;
     
     if (numero2 == 0){
     
         div = 0;
         
         System.out.println("ERROR. No se puede dividir en 0");
     
     } else {
      div = numero1 / numero2;
         System.out.println("el resultado de la division es: " + div);
     }
    
    }
}
