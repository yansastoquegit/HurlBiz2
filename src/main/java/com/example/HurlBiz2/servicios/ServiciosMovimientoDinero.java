package com.example.HurlBiz2.servicios;

import com.example.HurlBiz2.entidades.MovimientoDinero;

public class ServiciosMovimientoDinero {
    MovimientoDinero movimiento1;

    //Constructor
    public ServiciosMovimientoDinero(){
        this.movimiento1 = new MovimientoDinero(50000, true, "Venta camisa", "Paco");
    }
    public MovimientoDinero getMovimientos(){
        return this.movimiento1;
    }
}
