/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext_ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author andru
 */
public class Alquiler {

    protected String nombre;
    protected int documento, puerto;
    protected Date diaAlquiler, diaDevolucion;

    public Alquiler() {
    }

    
    

    public Alquiler(String nombre, int documento, int puerto, String diaAlquiler, String diaDevolucion) throws ParseException {
        this.nombre = nombre;
        this.documento = documento;
        this.puerto = puerto;
        this.diaAlquiler = convertirStringADate(diaAlquiler);
        this.diaDevolucion = convertirStringADate(diaDevolucion);
    }

    public Date convertirStringADate(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        return sdf.parse(fecha);

    }

    public double modulo(int eslora) {
        return eslora * 10;
    }

    public int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

    //FUNCIONA PERO NO SE COMO HACER PARA QUE ME TOME LOS DIAS DESDE EL OBJETO
    public double alquiler() throws ParseException {

        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar(diaDevolucion.getYear()+1900, diaDevolucion.getMonth(), diaDevolucion.getDate());

        System.out.println("Days= " + daysBetween(cal1.getTime(), cal2.getTime()));
        return 0;

    }

    public void mostrar() {

    }
}
