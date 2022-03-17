
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andru
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeroMagico, numeroIngresado;
        
        System.out.println("ADIVINA EL NUMERO");
        numeroMagico = (int) (Math.random() * 1000 )/2;
        
        

        try {
            System.out.println("Ingrese el numero que crea correcto");
            numeroIngresado = leer.nextInt();
            
            if (numeroMagico > numeroIngresado){
                System.out.println("El numero ingresado es menor al numero a adivinar");
                System.out.println(numeroMagico);
            }else{
                System.out.println("El numero ingresado es mayor al numero a adivinar");
                System.out.println("El numero es: " + numeroMagico);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ingrese solo numeros");

        }
    }

}
