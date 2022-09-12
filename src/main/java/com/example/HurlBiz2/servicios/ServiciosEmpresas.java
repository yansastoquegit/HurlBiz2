package com.example.HurlBiz2.servicios;

import com.example.HurlBiz2.entidades.Empresa;

import java.util.ArrayList;
import java.util.List;

public class ServiciosEmpresas {
    //Atributos del tipo paciente lo que quiere decir que esto es un objeto
    Empresa empresa1;
    Empresa empresa2;
    List<Empresa> listaEmpresas;

    //Contructor
    public ServiciosEmpresas(){
        this.empresa1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", null);
        this.empresa2 = new Empresa("Bavaria", "Calle35N98-60", "5786123", "830777", null);
        this.listaEmpresas = new ArrayList<>();
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
    }

    //Metodo Getter para obtener la lista de empresas

    public List<Empresa> getListaEmpresas() {
        return this.listaEmpresas;
    }
}
