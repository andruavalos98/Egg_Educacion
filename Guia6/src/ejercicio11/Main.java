/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaInicial = dateFormat.parse("2016-02-14");
        Date fechaFinal = dateFormat.parse("2016-03-22");

        int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);

        System.out.println("Hay " + dias + " dias de diferencia");

    }
}
