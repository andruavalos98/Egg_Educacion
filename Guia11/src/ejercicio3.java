
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andru
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num, den;
        int nume, deno;

        System.out.println("Ingrese el numerador");
        num = leer.next();
        nume = parseInt(num);

        System.out.println("Ingrese el denominador");
        den = leer.next();
        deno = parseInt(den);

        System.out.println(nume / deno);

    }

}
