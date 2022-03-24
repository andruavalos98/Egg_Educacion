/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.controladores;

import com.libreria.libreria.servicios.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andru
 */
@Controller
@RequestMapping("/seleccion")
public class SeleccionController {
    
    @Autowired
    private AutorServicio autorServicio;
    
    @GetMapping("")
    public String seleccion(){
        return "seleccion";
    }
    
}
