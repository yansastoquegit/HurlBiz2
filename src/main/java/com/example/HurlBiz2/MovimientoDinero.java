package com.example.HurlBiz2;

public class MovimientoDinero {
    //Atributos
    private Integer monto;
    private Boolean positivo;
    private String concepto;
    private String usuario;

    //Constructor

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
}
