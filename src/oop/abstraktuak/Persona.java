package oop.abstraktuak;

import java.util.Date;

public abstract class Persona {
	
	protected String nombre;
	protected String dni;
	protected Date fechaNacimiento;
	
	public Persona(String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public abstract void esan(String esaldia);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
