/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.controladores;

import com.libreria.libreria.entidades.Editorial;
import com.libreria.libreria.servicios.EditorialServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author andru
 */
@Controller
@RequestMapping("/editorial")
public class EditorialController {
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("")
    public String formulario(Model modelo) {
        Editorial editorial = new Editorial();
        modelo.addAttribute("editorial", editorial);
        return "editorial-formulario";
    }

    @PostMapping("/save")
    public String formularioData(@RequestParam("nombre") String nombre, Model modelo) {
        Editorial editorial = new Editorial();
        try {

            editorialServicio.ingresarEditorial(nombre);
            modelo.addAttribute("editorial", editorial);
            return "editorial-formulario";
        } catch (Exception ex) {
            ex.printStackTrace();
            modelo.addAttribute("editorial", editorial);
            modelo.addAttribute("error", ex.getMessage());
            return "editorial-formulario";
        }
    }

    @GetMapping("/lista-editoriales")
    public String listAll(Model modelo) {

        List<Editorial> listaEditoriales = editorialServicio.obtenerAlta();
        modelo.addAttribute("listaEditoriales", listaEditoriales);
        return "lista-editoriales";

    }
    
    @GetMapping("/dar-de-baja")
    public String darDeBaja(@RequestParam("editorialId") String editorialId){
        try {
            editorialServicio.deshabilitar(editorialId);
            return "redirect:/editorial/lista-editoriales";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/editorial/lista-editoriales";
        }
    }
    
    @PostMapping("/modificar")
    public String modificar(@RequestParam("editorialId") String edtorialId, @RequestParam("editorialNombre") String editorialNombre){
        try {
            editorialServicio.modificarEditorial(edtorialId, editorialNombre);
            return "redirect:/editorial/lista-editoriales";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/editorial/lista-editoriales";
        }
    }
    
}
