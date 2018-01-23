package com.curso.main;

import com.curso.moda.Vendedores;
import com.curso.moda.Transportistas;
import com.curso.moda.Administrativos;
import com.curso.moda.Empleados;

public class Main {

	public static void main(String[] args) {
		
		Empleados  v = new Vendedores(1,"Julio","Contreras",25,"Sol");
		Transportistas t = new Transportistas(2,"Alberto","Tostado",18,"Opel Corsa");
		Administrativos a = new Administrativos(3,"Maria","Garcia",27,"Ventas");

		System.out.println("Soy "+v.getNombre()+" "+v.getApellidos()+", tengo  "+v.getEdad()+" y tabajo en "+((Vendedores)v).getTienda());
		System.out.println("Soy "+t.getNombre()+" "+t.getApellidos()+", tengo  "+t.getEdad()+" y tabajo en "+t.getVehiculo());
		System.out.println("Soy "+a.getNombre()+" "+a.getApellidos()+", tengo  "+a.getEdad()+" y tabajo en "+a.getDepartamento());
		
		System.out.println(v.cobrar());
		System.out.println(t.descansar());
		System.out.println(a.trabajar());
	}

}
