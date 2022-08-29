package com.example.HurlBiz2;

public class Empleado {

    //Atributos
    private String nombre;
    private String correo;
    private boolean administrador;
    private String empresa;

    //Constructores

    public Empleado(String nombre, String correo, boolean administrador, String empresa) {
        this.nombre = nombre;
        this.correo = correo;
        this.administrador = administrador;
        this.empresa = empresa;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
