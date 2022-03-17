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
public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private int numeroCuenta;
    private long DNI, saldoActual;

    public Cuenta(int numeroCuenta, long DNI, long saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public long getsaldoActual() {
        return saldoActual;
    }

    public void setsaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void Cuenta() {

        System.out.println("ingrese el numero de cuenta");
        numeroCuenta = leer.nextInt();

        System.out.println("ingrese el numero de DNI");
        DNI = leer.nextLong();

        System.out.println("ingrese el saldo actual");
        saldoActual = leer.nextLong();

    }

    public double Ingreso() {
        int sumaSaldo;

        System.out.println("ingrese la cantidad que desea sumar al saldo actual");
        sumaSaldo = leer.nextInt();

        saldoActual = saldoActual + sumaSaldo;
       

        return saldoActual;

    }

    public double retirar() {
        int cantidadRetiro;

        System.out.println("ingrese la cantidad que desea retirar");
        cantidadRetiro = leer.nextInt();

        saldoActual = saldoActual - cantidadRetiro;

        return saldoActual;
    }

    public void extraccionRapida() {
        int extRapida;

        System.out.println("ingrese la cantidad que desea retirar. Hasta un 20% de su saldo actual");
        extRapida = leer.nextInt();

        if (extRapida <= saldoActual * 0.2) {

            saldoActual = saldoActual - extRapida;
            
            System.out.println("SU SALDO ACTUAL ES: " + saldoActual);
        } else {
            System.out.println("la cantidad mayor al 20%");

        }

    }
    
    public void consultarSaldo(){
    
        System.out.println("su saldo actial es: " + saldoActual);
    
    }
    
    public void consultarDatos(){
    
        System.out.println("DNI: " + DNI);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldoActual);
    
    }
}
