package oop.abstraktuak;

public class Modulo {

	private String nombre;
	private int horas;
	
	public Modulo(String izena, int orduak){
		this.nombre = izena;
		this.horas = orduak;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
