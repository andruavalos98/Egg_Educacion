/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDao;

/**
 *
 * @author andru
 */
public class FabricanteServicios {

    private FabricanteDao fabricanteDao = new FabricanteDao();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarFabricante() {
        Fabricante fabricante = new Fabricante();
        System.out.println("Por favor ingrese un nombre");
        fabricante.setNombre(leer.next());
        fabricanteDao.ingresarFabricante(fabricante);

    }

}
