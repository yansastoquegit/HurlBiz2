package com.example.HurlBiz2.controladores;


import com.example.HurlBiz2.entidades.Empresa;
import com.example.HurlBiz2.servicios.ServiciosEmpresas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//se deben convertir esta clase en un controlador escribiendo restcontroller, para que sea un controlador de
// requerimientos de usuario para Sprint Boot utilizando los Rest que son las peticiones de cliente.

@RestController
public class ControlEmpresas {
/*
//Lo que sigue se utiliza para una visualizacion de prueba, se ve una respuesta sensilla del RestController.
    //Tenemos que hacer un mapeo para poder direccionar lo que nos estan pidiendo, el metodo que sigue se
    // puede interpretar recibiendo la informacion de la URL a traves del papping
    @GetMapping("/vista1")
    //Pruebas de visualización. Ponemos un metodo cualquiera para verlo en la pagina
    public String visualizar(){
        return "Primera vista de una Web con SprintBoot";
    }

    @GetMapping("/vista2")
    public Empresa ControlEmpresas(){
        Empresa emp1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", null);
        return emp1;
    }
 */
    //Creamos un atributo de la clase ServiciosEmpresas para poder importarlo y así relacionar la informacion

    ServiciosEmpresas ServiEmpresa;

    //Constructor del controlador
    public ControlEmpresas(){
        //Con el atributo ServiEmpresa que creamos, vamos a crear una nueva instancia de ServiciosEmpresas
        //es como usar un comodin para conectarlo al servicio
        this.ServiEmpresa = new ServiciosEmpresas();

    }

    //Ahora creamos un metodo para retornar la lista de empresas solicitada, usando el metodo GetListaEmpresas que
    //habiamos creado en la clase ServiciosEmpresas, es como usar el metodo indirectamente. Pero tambien toca mapearlo
    //para que se muestre en la pagina, esto debido a que borramos todas las visualizaciones que teniamos arriba

    @GetMapping("/verempresa")
    public List<Empresa> VerEmpresas(){
        return this.ServiEmpresa.getListaEmpresas();
    }


}
