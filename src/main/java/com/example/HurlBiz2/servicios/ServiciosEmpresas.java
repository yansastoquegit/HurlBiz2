package com.example.HurlBiz2.servicios;

import com.example.HurlBiz2.entidades.Empleado;
import com.example.HurlBiz2.entidades.Empresa;
import com.example.HurlBiz2.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//Convertir está clase en un servicio que se conecta a algo remoto en la nube
public class ServiciosEmpresas {
    //Atributos del tipo Empresas lo que quiere decir que esto es un objeto
    /*
    Empresa empresa1;
    Empresa empresa2;
    List<Empresa> listaEmpresas;

    ServiciosEmpleados emplea = new ServiciosEmpleados();
*/
    //Contructor
    /*
    public ServiciosEmpresas(){
        //Aqui Se instancia un empleado directamente sin poner los datos ya que el constructor de ServiciosEmpleados
        //No tiene parametros en el contructor
        Empleado trabajador1 = this.emplea.empleado1;//Se trae el empleado que creamos de prueba
        //Aqui (Servicios empresas) se instancian dos empresas para probar
        this.empresa1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", trabajador1);
        this.empresa2 = new Empresa("Bavaria", "Calle35N98-60", "5786123", "830777", null);
        this.listaEmpresas = new ArrayList<>();
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
    }

     */

    //Utilizando el repositorio
    private repositorioEmpresa repositorioEmpre;

    //Constructor
    public ServiciosEmpresas(repositorioEmpresa repositorioEmpre){
        this.repositorioEmpre = repositorioEmpre;
    }

    //Metodo Getter para obtener la lista de empresas
    //Metodo para visualizar a partir de un metodo ETet

    public List<Empresa> getListaEmpresas() {
        return this.repositorioEmpre.findAll();
    }
    //Metodo para crear a partir del metodo POST
    public Empresa crearEmpresa (Empresa nuevaEmpresa){
        return this.repositorioEmpre.save(nuevaEmpresa);
    }

    //Metodo para actualizar a partir del metodo UP o  PATCH
    public Empresa actualEmpresa (Long id, Empresa EmprActualiza){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();
        empresaActual.setNombre(EmprActualiza.getNombre());
        empresaActual.setDireccion(EmprActualiza.getDireccion());
        empresaActual.setTelefono(EmprActualiza.getTelefono());
        empresaActual.setNit(EmprActualiza.getNit());
        return this.repositorioEmpre.save(empresaActual);
    }

    //Metodo para eliminar un registro de la DB

    public Empresa eliminEmpresa(Long id){
        Empresa empresaActual = repositorioEmpre.findById(id).orElseThrow();
        this.repositorioEmpre.deleteById(id);//Solo con esta linea funciona
        return empresaActual;//Pero esta muestra lo que se borró.

    }



}
