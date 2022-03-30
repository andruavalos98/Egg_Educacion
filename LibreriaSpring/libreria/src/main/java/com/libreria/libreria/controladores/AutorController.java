/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.controladores;

import com.libreria.libreria.entidades.Autor;
import com.libreria.libreria.servicios.AutorServicio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author andru
 */
@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping("")
    public String formulario(Model modelo) {
        Autor autor = new Autor();
        modelo.addAttribute("autor", autor);
        return "autor-formulario";
    }

    @PostMapping("/save")
    public String formularioData(@RequestParam("nombre") String nombre, Model modelo) {
        Autor autor = new Autor();
        try {
            autorServicio.ingresarAutor(nombre);
            
            modelo.addAttribute("autor", autor);
            return "autor-formulario";
        } catch (Exception ex) {
            ex.printStackTrace();
            modelo.addAttribute("autor", autor);
            modelo.addAttribute("error", ex.getMessage());
            return "autor-formulario";
        }
    }

    @GetMapping("/lista-autores")
    public String listAll(Model modelo) {
        List<Autor> listaAutores = autorServicio.obtenerAlta();
        modelo.addAttribute("listaDeAutores", listaAutores);
        return "lista-autores";

    }

    @GetMapping("/dar-de-baja")
    public String darDeBaja(@RequestParam("autorId") String autorId, Model modelo) {
        try {
            autorServicio.deshabilitar(autorId);

            return "redirect:/autor/lista-autores";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/autor/lista-autores";
        }

    }

    @PostMapping("/modificar")
    public String modificar(@RequestParam("autorId") String autorId, Model modelo, @RequestParam("autorNombre") String autorNombre) {
        try {
            autorServicio.modificarAutor(autorId, autorNombre);

            return "redirect:/autor/lista-autores";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/autor/lista-autores";
        }
    }

}
