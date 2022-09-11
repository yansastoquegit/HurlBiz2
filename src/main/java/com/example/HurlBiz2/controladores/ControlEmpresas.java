package com.example.HurlBiz2.controladores;


import com.example.HurlBiz2.entidades.Empresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//se deben convertir esta clase en un controlador escribiendo restcontroller, para que sea un controlador de
// requerimientos de usuario para Sprint Boot utilizando los Rest que son las peticiones de cliente.

@RestController
public class ControlEmpresas {

    //Tenemos que hacer un mapeo para poder direccionar lo que nos estan pidiendo, el metodo que sigue se
    // puede interpretar recibiendo la informacion de la URL a traves del papping
    @GetMapping("/vista1")
    //Pruebas de visualización. Ponemos un metodo cualquiera para verlo en la pagina
    public String visualizar(){
        return "Primera vista de una Web con SprintBoot";
    }

    @GetMapping("/vista2")
    public Empresa ControlEmpresas(){
        Empresa empresa1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", null);
        return empresa1;
    }


}
