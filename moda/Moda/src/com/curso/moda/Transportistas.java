package com.curso.moda;

public class Transportistas extends Empleados {

	String vehiculo;
	
	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Transportistas(int id, String nombre, String apellidos, int edad, String vehiculo) {
		super(id, nombre, apellidos, edad);
		this.vehiculo = vehiculo;
	}

	public Transportistas(int id, String nombre, String apellidos, int edad) {
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
