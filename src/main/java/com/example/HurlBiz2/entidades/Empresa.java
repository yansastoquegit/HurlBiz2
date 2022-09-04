package com.example.HurlBiz2.entidades;

public class Empresa {
    //atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    //Nuevo
    private Empleado empleados;


    //Constructor

    public Empresa(String nombre, String direccion, String telefono, String nit,
                    Empleado empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empleados = empleados;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {

        this.nit = nit;
    }

    public Empleado getEmpleados(){
        return empleados;
    }
    public void setEmpleados (Empleado empleados){
        this.empleados = empleados;
    }





}
