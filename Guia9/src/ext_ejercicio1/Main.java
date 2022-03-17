/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext_ejercicio1;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author andru
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        Veleros v1 = new Veleros();
        BarcoComun bc1 = new BarcoComun();
        BarcoMotor bm1 = new BarcoMotor();
        Yates y1 = new Yates();

        

        Alquiler a = new Alquiler("andrea", 234567,567,"26012022","24032022");

        a.alquiler();

    }

}
