package oop.herentzia.football;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Futbolista extends Persona{
	
	private int dorsal;
	private String posicion;

	public void concentrarse(){
		System.out.println("Soy futbolista y estoy concentrandome.");
	}
	
	public void viajar(){
		System.out.println("Soy futbolista y realizado un viaje.");
	}
	
	public void jugarPartido(){
		int numGoles = (int)Math.random()*5+1;
		System.out.println("He jugado un partido y he metido " + numGoles + " goles.");
	}
	
	public void entrenar(){
		System.out.println("He entrenado como un campeon");
	}


	@Override
	public String toString() {
		return "Futbolista [nombre=" + getNombre() +", apellidos=" + getApellidos() 
				+ ", dorsal=" + dorsal + ", posicion=" + posicion + "]";
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
}
