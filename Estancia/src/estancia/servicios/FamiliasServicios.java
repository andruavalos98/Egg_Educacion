/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Familias;
import estancia.persistencia.FamiliasDao;
import java.util.List;

/**
 *
 * @author andru
 */
public class FamiliasServicios {
    
    private FamiliasDao familiasDao = new FamiliasDao();
    
    public void mostrarMas3hijosMayores10anios(){
        List<Familias> familias = familiasDao.masDe3HijosYmenoresDe10anios();
        for (Familias fam : familias){
            System.out.println("------------" + fam.getNombre() + "------------" + "\nNumero de hijos: " + fam.getNumHijos() + "\nEdad maxima: " + fam.getEdadMax() + "\n");
        }
    }
    
    public void mostrarHotmail(){
        List <Familias> familias = familiasDao.correoHotmail();
        for(Familias fam : familias){
            System.out.println("---------" + fam.getNombre() + "---------" + "\nEmail: "+fam.getEmail() + "\n");
        }
    }
            
    
}
