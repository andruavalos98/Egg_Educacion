/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Casas;
import estancia.entidades.Familias;
import estancia.persistencia.CasasDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andru
 */
public class CasasServicios {

    private CasasDao casasDao = new CasasDao();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private SimpleDateFormat convertir = new SimpleDateFormat("yyyy-mm-dd");

    public void mostrarCasasDisponibles01082020_31082020_RU() {
        List<Casas> casas = casasDao.casasDisponibles01082020_31082020_RU();
        for (Casas casa : casas) {
            System.out.println("-------------" + "\nId Casa: " + casa.getIdCasa() + "\nCalle: " + casa.getCalle() + "\nNumero: " + casa.getNumero() + "\nPais: " + casa.getPais() + "\nFecha desde: " + casa.getFechaDesde() + "\nFecha Hasta: " + casa.getFechaHasta() + "\n");
        }

    }

    public void mostrarCasasDisponibles() {
     Casas casas = new Casas();

    System.out.println ("Casas disponibles");
    System.out.print ("Desde: ");
        try {
            casas.setFechaDesde(convertir.parse(leer.next()));
        } catch (ParseException ex) {
            System.out.println("No se pudo convertir de string a date");
        }
        System.out.print("Hasta: ");
        try {
            casas.setFechaHasta(convertir.parse(leer.next()));
        } catch (ParseException ex) {
            System.out.println("No se pudo convertir de string a date");
        }
        
    List<Casas> casasDisponibles = casasDao.casasDisponibles(casas.getFechaDesde(), casas.getFechaHasta());
         
    for (Casas c : casasDisponibles) {
            System.out.println("-------------" + "\nId Casa: " + c.getIdCasa() + "\nCalle: " + c.getCalle() + "\nNumero: " + c.getNumero() + "\nPais: " + c.getPais() + "\nFecha desde: " + c.getFechaDesde() + "\nFecha Hasta: " + c.getFechaHasta() + "\n");
    }

}

}
