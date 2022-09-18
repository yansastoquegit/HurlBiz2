package com.example.HurlBiz2.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="correo")
    private String correo;
    @Column(name="administrador")
    private boolean administrador;
    @Column(name="empresa")
    private String empresa;
    //Nuevo
    @Transient
    private MovimientoDinero movimientos;


    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre, String correo, boolean administrador, String empresa, MovimientoDinero movimientos) {
        this.nombre = nombre;
        this.correo = correo;
        this.administrador = administrador;
        this.empresa = empresa;
        this.movimientos = movimientos;
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

    public MovimientoDinero getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(MovimientoDinero movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", administrador=" + administrador +
                ", empresa='" + empresa + '\'' +
                ", movimientos=" + movimientos +
                '}';
    }
}
