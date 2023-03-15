
package com.portfolio.jjt.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class UsuarioPrincipal implements UserDetails{
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    
    //Constructor

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsuarioPrincipal build(Usuario usuario) {
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect((Collector<? super SimpleGrantedAuthority, A, R>) Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword(),authorities);
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }
    
   
    public String getNombre() {
        return nombre;
    }
    
   
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return nombreUsuario;
    }

    public boolean isAccountNonExpired() {
        return true;
    }
     
    public boolean isAccountNonLocked() {
        return true;
    }
    
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    public boolean isEnabled() {
        return true;
    }

    private static class A {

        public A() {
        }
    }

    private static abstract class SimpleGrantedAuthority implements Stream<Object> {

        public SimpleGrantedAuthority(String name) {
        }
    }
    
}
