package com.example.HurlBiz2;

import com.example.HurlBiz2.entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


//@SpringBootApplication
public class HurlBiz2Application {

	public static void main(String[] args) {
		System.out.println("Prueba");
		//SpringApplication.run(HurlBiz2Application.class, args);
		Empresa empresa1 = new Empresa("Femsa", "Calle3N30-660", "2971205", "830067", null);

		List<Empresa> listaEmpresas = new ArrayList<>();
		listaEmpresas.add(empresa1);

		System.out.println(listaEmpresas.get(0).toString());

	}

}
