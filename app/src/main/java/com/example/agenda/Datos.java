package com.example.agenda;

import java.io.Serializable;

public class Datos implements Serializable {
    String nombre;
    String fecha;
    String numero;
    String correo;
    String descripcion;
    public Datos(String nombre, String fecha, String numero, String correo, String descripcion){
        this.nombre = nombre;
        this.fecha = fecha;
        this.numero = numero;
        this.correo = correo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
