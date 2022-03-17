/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author andru
 */
public class Matematica {

    int nro1, nro2;

    public Matematica(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public Matematica() {
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public void devolverMayor() {

        System.out.println(nro1 < nro2 
                ? " el mayor es: " + nro2 
                : "el mayor es: " + nro1);

    }

    public void calcularPotencia() {

        System.out.println(nro1 < nro2 
                ? nro2 + "^" + nro1 + " = " + Math.pow(nro2, nro1) 
                : nro1 + "^" + nro2 + " = " + Math.pow(nro1, nro2));

    }

    public void calculaRaiz() {

        System.out.println(nro1 < nro2 
                ? "la raiz cuadrada de " + nro1 + " es: " + Math.sqrt(nro1) 
                : "la raiz cuadrada de " + nro2 + " es: " + Math.sqrt(nro2));

    }

}
