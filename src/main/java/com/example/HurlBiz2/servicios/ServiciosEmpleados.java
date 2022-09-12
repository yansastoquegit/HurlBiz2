package com.example.HurlBiz2.servicios;

import com.example.HurlBiz2.entidades.Empleado;
import com.example.HurlBiz2.entidades.MovimientoDinero;

public class ServiciosEmpleados {
    Empleado empleado1;
    ServiciosMovimientoDinero ServMovDine = new ServiciosMovimientoDinero();


    //Aqí se crea el constructor de ServiciosEmpleados sin parametros, pero de una vez se instancia un empleado
    //para hacer pruebas
    public ServiciosEmpleados(){
        MovimientoDinero MovimientoRealizado = this.ServMovDine.movimiento1;
        this.empleado1 = new Empleado("Juan", "juan@femsa.com", false, "Femsa", MovimientoRealizado);
    }
    public Empleado getEmpleados(){
        return empleado1;
    }

}
