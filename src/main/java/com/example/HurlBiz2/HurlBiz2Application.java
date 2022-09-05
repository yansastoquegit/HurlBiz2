package com.example.HurlBiz2;

import com.example.HurlBiz2.entidades.Empleado;
import com.example.HurlBiz2.entidades.Empresa;
import com.example.HurlBiz2.entidades.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication

public class HurlBiz2Application {

	public static void main(String[] args) {
		System.out.println("Prueba");
		//SpringApplication.run(HurlBiz2Application.class, args);

		MovimientoDinero movimiento1 = new MovimientoDinero(50000, true, "Venta camisa", "Paco");
		MovimientoDinero movimiento2 = new MovimientoDinero(40000, false, "pago vigilancia", "Pepe");


		Empleado empleado1 = new Empleado("Juan", "juan@femsa.com", false, "Femsa", movimiento1);
		Empleado empleado2 = new Empleado("Pedro", "pedro@bavaria.com", true, "Bavaria", movimiento2);

		Empresa empresa1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", empleado1);
		Empresa empresa2 = new Empresa("Bavaria", "Carrera3N30-660", "7425838", "977643", empleado2);

		List<Empresa> listaEmpresas = new ArrayList<>();
		List<Empleado> listaEmpleados = new ArrayList<>();


		listaEmpresas.add(empresa1);
		listaEmpresas.add(empresa2);

		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);


		System.out.println("Empresas");
		for (int i = 0; i < listaEmpresas.size(); i++) {
			System.out.println(listaEmpresas.get(i).toString());
		}
		System.out.println("Empleados");
		for (int i = 0; i < listaEmpleados.size(); i++) {
			System.out.println(listaEmpleados.get(i).toString());
		}

	}

}
