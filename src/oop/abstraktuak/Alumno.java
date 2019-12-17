package oop.abstraktuak;

import java.util.ArrayList;

public class Alumno extends Persona{

	private ArrayList<Modulo> modulosMatriculados;
	
	public Alumno(String nombre, String dni){
		super(nombre, dni);
		this.modulosMatriculados = new ArrayList<Modulo>();
	}

	public void matricular(Modulo modulo){
		if(modulosMatriculados != null){
			modulosMatriculados.add(modulo);
		}
		
	}
	
	public ArrayList<Modulo> getModulosMatriculados() {
		return modulosMatriculados;
	}

	public void setModulosMatriculados(ArrayList<Modulo> modulosMatriculados) {
		this.modulosMatriculados = modulosMatriculados;
	}
	
	
}
