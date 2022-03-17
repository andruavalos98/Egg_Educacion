/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.EditorialDao;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class EditorialServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private EditorialDao ed = new EditorialDao();
    
    int i = 1;

    public void guardarEditorial() {
        
        
        Editorial editorial = new Editorial();
        
        editorial.setId(i);
        i++;
        
        System.out.println("Ingrese el nombre de la editorial");
        editorial.setNombre(leer.next());
        
        editorial.setAlta(true);

        ed.guardar(editorial);
    }

}
