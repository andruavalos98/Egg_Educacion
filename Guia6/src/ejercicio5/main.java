/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();

        int op;

        do {
            System.out.println("--------------------------------");
            System.out.println(
                    "Elija una opcion");

            System.out.println(
                    "1. Crear cuenta");
            System.out.println(
                    "2. Ingresar dinero");
            System.out.println(
                    "3. Retirar dinero");
            System.out.println(
                    "4. Extraccion rapida");
            System.out.println(
                    "5. Consultar saldo");
            System.out.println(
                    "6. Consultar datos");
            System.out.println(
                    "7. Salir \n");

            op = leer.nextInt();
            System.out.println("");

            switch (op) {

                case 1:
                    cuenta.Cuenta();
                    System.out.println("");
                    break;
                case 2:
//                    cuenta.Ingreso();
                    System.out.println("SU SALDO ACTUAL ES: " + cuenta.Ingreso());
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("SU SALDO ACTUAL ES: " + cuenta.retirar());
                    System.out.println("");
                    break;

                case 4:
                   cuenta.extraccionRapida();
                    System.out.println("");
                        

                    break;

                case 5:
                    cuenta.consultarSaldo();
                    System.out.println("");
                    break;

                case 6:
                    cuenta.consultarDatos();
                    System.out.println("");
                    break;

                case 7:

                    return;

                default:
                    System.out.println("ingrese una opcion valida");
                    System.out.println("");

            }
        } while (op != 7);

    }

}
