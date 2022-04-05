/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.controladores;

import com.libreria.libreria.servicios.MailServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andru
 */
@Controller
@RequestMapping("/")
public class MainController {
    
    @Autowired
    private MailServicio mailServicio;
    
    @GetMapping("")
    public String main(){
        return "index";
}
    
    @GetMapping("enviarmail")
    public String enviarMail(Model modelo){
        mailServicio.enviarEmailSimple("programacion.tucuman@gmail.com", "saludos", "Hola soy un mail enviado desde un proyecto con springBoot");
        modelo.addAttribute("mail", "se esta procesando el envio del mail");
        return "index";
    }
            
    
}
