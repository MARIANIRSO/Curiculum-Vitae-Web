/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.web.dao.domian;

/**
 *
 * @author red9
 */
public class Persona {
    private Perfiles Perfil;
    private String nombre;
    private String apellido;
    private String correo;
    private String mensaje;

    public Persona() {
    }

    public Perfiles getPerfil() {
        return Perfil;
    }

    public void setPerfil(Perfiles Perfil) {
        this.Perfil = Perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "Perfil=" + Perfil + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", mensaje=" + mensaje + '}';
    }
    
}
