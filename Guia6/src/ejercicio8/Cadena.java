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
public class Cadena {

    String frase;

    public Cadena(String frase) {
        this.frase = frase;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void mostrarVocales() {
        int contador = 0;

        for (int x = 0; x < frase.length(); x++) {

            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
                contador++;

            }

        }
        System.out.println("La palabra " + frase + " contiene " + contador + " vocales");

    }

    public void vecesRepetido(String letra) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        
        System.out.println("La letra " + letra +  " se encontró " + contador + " veces");

    }
    
public void reemplazar(String letra){

    frase = frase.replace("a", letra);
    System.out.println(frase);
}

public boolean contiene(String letra){
    boolean resultado;
    resultado = frase.contains(letra);
    
    

    return resultado;
}

}
