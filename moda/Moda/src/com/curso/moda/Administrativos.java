package com.curso.moda;

public class Administrativos extends Empleados{
	
	String departamento;

	public Administrativos(int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
	}

	
	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Administrativos(int id, String nombre, String apellidos, int edad, String departamento) {
		super(id, nombre, apellidos, edad);
		this.departamento = departamento;
	}


	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "Estoy trabajando";
	}

	@Override
	public String descansar() {
		// TODO Auto-generated method stub
		return "Estoy descansando";
	}

	@Override
	public String cobrar() {
		// TODO Auto-generated method stub
		return "Estoy cobrando";
	}

}
