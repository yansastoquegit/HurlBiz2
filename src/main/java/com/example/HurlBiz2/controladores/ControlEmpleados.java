package com.example.HurlBiz2.controladores;

import com.example.HurlBiz2.entidades.Empleado;
import com.example.HurlBiz2.servicios.ServiciosEmpleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpleados {

    //Un atributo ficticio
    ServiciosEmpleados trabajadores;

    //Contructor de esta clase
    public ControlEmpleados(){
        this.trabajadores = new ServiciosEmpleados();

    }
    @GetMapping("/verempleados")
    public Empleado ControlarEmpleados(){
        return this.trabajadores.getEmpleados();
    }

}
