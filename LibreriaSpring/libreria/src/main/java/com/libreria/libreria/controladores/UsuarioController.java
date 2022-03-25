/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.controladores;

import com.libreria.libreria.entidades.Usuario;
import com.libreria.libreria.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("")
    public String registro(Model modelo) {
        modelo.addAttribute("username", "");
        modelo.addAttribute("password", "");
        modelo.addAttribute("password2", "");
        return "login";
    }

    @PostMapping("/registro")
    public String registroUsuario(@RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("password2") String password2,
            Model modelo) {

        try {
            Usuario usuario = usuarioServicio.registrarUsuario(username, password, password2);
            modelo.addAttribute("success", "Usuario registrado con exito");

            return "usuario-formulario";
        } catch (Exception ex) {
            modelo.addAttribute("username", username);
            modelo.addAttribute("password", password);
            modelo.addAttribute("password2", password2);
            modelo.addAttribute("error", ex.getMessage());
            return "usuario-formulario";
        }
    }
    
    @PreAuthorize("hasAnyRole('ROLE_ADMINISTRADOR')")
    @GetMapping("/lista")
    public String listaUsuarios(Model modelo){
        List<Usuario> listaUsuarios = usuarioServicio.findAll();
        modelo.addAttribute("usuarios", listaUsuarios);
        return "lista-usuarios";
    }

}
