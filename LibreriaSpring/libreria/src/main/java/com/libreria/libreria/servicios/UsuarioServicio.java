/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.servicios;

import com.libreria.libreria.entidades.Usuario;
import com.libreria.libreria.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author andru
 */
@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario registrarUsuario(String username, String password, String password2) throws Exception {
        Usuario usuario = usuarioRepositorio.findByUsername(username);

        if (username.isEmpty()) {
            throw new Exception("El username no puede estar vacio");

        }
        if (usuario != null) {
            throw new Exception("El usuario ya existe, pruebe otro nombre");
        }
        if(password.isEmpty()){
            throw new Exception("La contraseña no puede estar vacia");
        }
        if(password2.isEmpty()){
            throw new Exception("La contraseña no puede estar vacia");
        }
        if (!password.equals(password2)) {
            throw new Exception("Las contraseñas ingresadas deben ser iguales");

        }
        usuario = new Usuario();
        usuario.setUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        usuario.setPassword(encoder.encode(password));

        return usuarioRepositorio.save(usuario);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Usuario usuario = usuarioRepositorio.findByUsername(username);
            List<GrantedAuthority> autoritties = new ArrayList<>();

            return new User(username, usuario.getPassword(), autoritties);
        } catch (Exception e) {
            throw new UsernameNotFoundException("El usuario no existe");
        }
    }

}
