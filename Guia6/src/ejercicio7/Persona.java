/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Persona {

    Scanner leer = new Scanner(System.in);
    String nombre, sexo;
    Integer edad;
    double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, Integer edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();

        do {

            System.out.println("Sexo (M para masculino y F para femenino)");
            sexo = leer.next();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {

                System.out.println("ERROR. Ingrese M o F");

            }

        } while (sexo.equalsIgnoreCase("M") == false && sexo.equalsIgnoreCase("F") == false);

        do {

            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();

            if (edad <= 0 && edad > 100) {

                System.out.println("ERROR. La edad tiene que estar entre 1 y 100");

            }

        } while (edad <= 0);

        do {
            System.out.println("Ingrese el peso de la persona");
            peso = leer.nextDouble();

        } while (peso <= 0);

        do {

            System.out.println("Ingrese la altura");
            altura = leer.nextDouble();

        } while (altura <= 0);

    }

    private int calcularIMC() {
        double imc;

        imc = peso / (altura * altura);

        return imc < 20 ? -1 : imc >= 20 && imc <= 25 ? 0 : 1;

    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void mostrarStats() {
        int gordura = calcularIMC();

        System.out.println("-----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad + " años - La persona: " + (esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad"));
        System.out.print("Peso: " + peso + " Estado: ");
        if (gordura == -1) {
            System.out.println("Por debajo del peso ideal");
        }
        if (gordura == 0) {
            System.out.println("Peso ideal");
        }
        if (gordura == 1) {
            System.out.println("Sobrepeso");
        }
        System.out.println("Altura: " + altura);
    }

}
