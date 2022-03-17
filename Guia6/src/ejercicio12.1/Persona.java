/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author carop
 */
public class Persona {
//Implemente la clase Persona. Una persona tiene un nombre y una fecha de
//nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
//siguientes métodos:
    public static Scanner sc = new Scanner(System.in);
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
     
//Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
//• Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
//al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
//que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.    
    public static Persona crearPersona(){
        Persona per = new Persona();
        System.out.println("Ingrese los datos de una persona");
        System.out.print("Nombre: ");
        per.setNombre(sc.nextLine());
        System.out.println("Fecha de Nacimiento: ");
        System.out.print("Ingrese el día(dd): ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes(MM): ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año(AAAA): ");
        int anio = sc.nextInt();
        Date fechaDeNac = new Date((anio-1900), (mes-1), dia);
        per.setFechaNacimiento(fechaDeNac);
       // System.out.println(fechaDeNac);
        return per;
    }
//• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
//Tener en cuenta que para conocer la edad de la persona también se debe
//conocer la fecha actual.
    public int calcularEdad(){
        Date fechaActual = new Date();
        int edad;
        //System.out.println(fechaNacimiento.getYear() + 1900);
        edad = (fechaActual.getYear() + 1900) - (fechaNacimiento.getYear() + 1900);
        if(fechaActual.getMonth() <= fechaNacimiento.getMonth() && fechaActual.getDate() <= fechaNacimiento.getDate())
            edad--;
        return edad;
        
    }
//• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
//otra edad y retorna true en caso de que el receptor tenga menor edad que la
//persona que se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(int edad){
        int receptor = calcularEdad();
       return (receptor < edad);
    }
//• Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior. 

    public void MostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.getDate() + "/" +(fechaNacimiento.getMonth()+1) + "/" + (fechaNacimiento.getYear()+1900));
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
