package com.example.HurlBiz2.controladores;

import com.example.HurlBiz2.entidades.MovimientoDinero;
import com.example.HurlBiz2.servicios.ServiciosMovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMovimientosDinero {
    ServiciosMovimientoDinero ServiMovDin;


    //Constructor
    public ControlMovimientosDinero(){
        this.ServiMovDin = new ServiciosMovimientoDinero();
    }

    @GetMapping("/vermovimientos")
    public MovimientoDinero ControlarMovimientoDinero(){
        return this.ServiMovDin.getMovimientos();
    }
}
