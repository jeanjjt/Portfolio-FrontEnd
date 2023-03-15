/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jjt.Security.Service;

import com.portfolio.jjt.Security.Entity.Usuario;
import com.portfolio.jjt.Security.Entity.UsuarioPrincipal;
import com.portfolio.jjt.Security.jwt.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    public UsuarioPrincipal loadUserByUsername(String nombreUsuario, Override Override) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }

    public UserDetails loadUserByUsername(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
