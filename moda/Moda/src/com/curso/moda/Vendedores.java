package com.curso.moda;

public class Vendedores extends Empleados{
	
	String tienda;
	
	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public Vendedores(int id, String nombre, String apellidos, int edad, String tienda) {
		super(id, nombre, apellidos, edad);
		this.tienda = tienda;
	}

	public Vendedores(int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
		// TODO Auto-generated constructor stub
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
