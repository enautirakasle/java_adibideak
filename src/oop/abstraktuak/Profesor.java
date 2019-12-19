package oop.abstraktuak;

import java.util.ArrayList;

public class Profesor extends Persona{

	public Profesor(String nombre, String dni) {
		super(nombre, dni);
		
	}

	ArrayList<Modulo> modulosImpartidos;
	
	public void impartir(Modulo modulo){
		if(modulosImpartidos != null){
			modulosImpartidos.add(modulo);
		}
	}

	public ArrayList<Modulo> getModulosImpartidos() {
		return modulosImpartidos;
	}

	public void setModulosImpartidos(ArrayList<Modulo> modulosImpartidos) {
		this.modulosImpartidos = modulosImpartidos;
	}

	@Override
	public void esan(String esaldia) {
		System.out.println("Irakaslea naiz " + esaldia);
		
	}
}
