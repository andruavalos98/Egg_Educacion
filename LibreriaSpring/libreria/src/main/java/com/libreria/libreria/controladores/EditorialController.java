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
        modelo.addAttribute("autor", editorial);
        return "autor-formulario";
    }

    @PostMapping("/save")
    public String formularioData(@RequestParam("nombre") String nombre, Model modelo) {
        Editorial editorial = new Editorial();
        try {

            editorialServicio.ingresarEditorial(nombre);
            modelo.addAttribute("autor", editorial);
            return "autor-formulario";
        } catch (Exception ex) {
            ex.printStackTrace();
            modelo.addAttribute("autor", editorial);
            modelo.addAttribute("error", ex.getMessage());
            return "autor-formulario";
        }
    }

    @GetMapping("/list")
    public List<Editorial> listAll(Model modelo) {

        return editorialServicio.obtener();

    }
    
}
