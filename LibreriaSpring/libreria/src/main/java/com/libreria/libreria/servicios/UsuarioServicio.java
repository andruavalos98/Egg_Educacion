/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.libreria.servicios;

import com.libreria.libreria.entidades.Foto;
import com.libreria.libreria.entidades.Usuario;
import com.libreria.libreria.enums.Rol;
import com.libreria.libreria.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author andru
 */
@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private FotoServicio fotoServicio;

    public Usuario registrarUsuario(String username,
            String password,
            String password2,
            MultipartFile file) throws Exception {

        Usuario usuario = usuarioRepositorio.findByUsername(username);

        if (username.isEmpty()) {
            throw new Exception("El username no puede estar vacio");

        }
        if (usuario != null) {
            throw new Exception("El usuario ya existe, pruebe otro nombre");
        }
        if (password.isEmpty()) {
            throw new Exception("La contraseña no puede estar vacia");
        }
        if (password2.isEmpty()) {
            throw new Exception("La contraseña no puede estar vacia");
        }
        if (!password.equals(password2)) {
            throw new Exception("Las contraseñas ingresadas deben ser iguales");

        }
        usuario = new Usuario();

        if (file != null) {
            Foto foto = fotoServicio.guardar(file);
            usuario.setFoto(foto);
        }

        usuario.setUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        usuario.setPassword(encoder.encode(password));
        usuario.setRol(Rol.USUARIO);

        return usuarioRepositorio.save(usuario);

    }

    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }

    public Usuario getIdUsuario(String id) {
        return usuarioRepositorio.getById(id);
    }

    public void agregarUsuarioALaSesion(Usuario usuario) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

        HttpSession session = attributes.getRequest().getSession(true);

        session.setAttribute("usuario", usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Usuario usuario = usuarioRepositorio.findByUsername(username);
            List<GrantedAuthority> autoritties = new ArrayList<>();
            agregarUsuarioALaSesion(usuario);
            autoritties.add(new SimpleGrantedAuthority("ROLE_" + usuario.getRol()));
            return new User(username, usuario.getPassword(), autoritties);

        } catch (Exception e) {
            throw new UsernameNotFoundException("El usuario no existe");
        }
    }

}
