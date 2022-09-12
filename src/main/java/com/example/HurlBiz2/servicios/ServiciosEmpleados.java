package com.example.HurlBiz2.servicios;

import com.example.HurlBiz2.entidades.Empleado;

public class ServiciosEmpleados {
    Empleado empleado1;

    //Aqí se crea el constructor de ServiciosEmpleados sin parametros, pero de una vez se instancia un empleado
    //para hacer pruebas
    public ServiciosEmpleados(){
        this.empleado1 = new Empleado("Juan", "juan@femsa.com", false, "Femsa", null);
    }
    public Empleado getEmpleados(){
        return empleado1;
    }

}
