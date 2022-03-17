/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) {
        Cadena cad1 = new Cadena("perra");
        Cadena cad2 = new Cadena("gato");

        //contador de vocales
        cad1.mostrarVocales();

        //invertir frase
        StringBuilder strb = new StringBuilder(cad1.frase);
        cad1.frase = strb.reverse().toString();
        System.out.println(cad1.frase);

        //voltea la frase a la forma original
        cad1.frase = strb.reverse().toString();

        //buscar letra
        cad1.vecesRepetido("o");

        //comparar longitud
        System.out.println("las cadenas tienen " + (cad1.frase.length() == cad2.frase.length() ? " la misma longitud " : "distinta longitud"));

        //unir frases
        System.out.println("la union de las dos cadenas es: " + cad1.frase + " " + cad2.frase);

        //reemplazar
        cad1.reemplazar("y");

        //contiene la letra?
        System.out.println("la frase " + (cad1.contiene("p") ? " SI contiene " : " NO contiene"));
    }

}
