package com.example.HurlBiz2.entidades;

import javax.persistence.*;

@Entity
@Table(name="movimientodinero")
public class MovimientoDinero {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name="monto")
    private Integer monto;
    @Column(name="positivo")
    private Boolean positivo;
    @Column(name="concepto")
    private String concepto;
    @Column(name="usuario")
    private String usuario;

    //Constructor

    public MovimientoDinero() {
    }

    public MovimientoDinero(Integer monto, Boolean positivo, String concepto, String usuario) {
        this.monto = monto;
        this.positivo = positivo;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    //Setters y Getters

    public Integer getMonto() {

        return monto;
    }

    public void setMonto(Integer monto) {

        this.monto = monto;
    }

    public Boolean getPositivo() {

        return positivo;
    }

    public void setPositivo(Boolean positivo) {

        this.positivo = positivo;
    }

    public String getConcepto() {

        return concepto;
    }

    public void setConcepto(String concepto) {

        this.concepto = concepto;
    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", positivo=" + positivo +
                ", concepto='" + concepto + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
