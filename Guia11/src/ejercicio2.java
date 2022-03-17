
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andru
 */
public class ejercicio2 {

    public static void main(String[] args) {

        int cadena[];
        cadena = new int[3];

        try {

            cadena[0] = 1;
            cadena[1] = 2;
            cadena[2] = 3;
            cadena[3] = 4;

            System.out.println(Arrays.toString(cadena));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("rebalsado");
        }
    }

}
