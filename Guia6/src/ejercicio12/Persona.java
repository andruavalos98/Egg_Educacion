/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Persona {

    String nombre;
            String fechaComoTexto;

    int anio, mes, dia;

    Date fecha = new Date(anio, mes, dia);

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void crearPersona() throws ParseException {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();

        System.out.println("Ingrese la fecha de nacimiento");
        String fechaComoTexto = leer.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);

    }
}
