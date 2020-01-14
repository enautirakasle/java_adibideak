package oop.herentzia.football;

public class Masajista extends Persona{
	

	private String titulacion;
	private int aniosExperiencia;

	public void concentrarse(){
		System.out.println("Soy masajista y estoy concentrandome.");
	}
	
	public void viajar(){
		System.out.println("Soy masajista y realizado un viaje.");
	}
	
	public void darMasaje(){
		System.out.println("Un buen masaje siempre ayuda.");
	}
	
	public void darMasaje(Futbolista futbolista){
		System.out.println("He dado un masaje a " + futbolista.getNombre() + " "
				+ futbolista.getApellidos());
	}
	
	@Override
	public String toString() {
		return "Masajista [nombre=" + getNombre() +", apellidos="+ getApellidos() 
				+ ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
	}

	/**
	 * @return the titulacion
	 */
	public String getTitulacion() {
		return titulacion;
	}

	/**
	 * @param titulacion the titulacion to set
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	/**
	 * @return the aniosExperiencia
	 */
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	/**
	 * setAniosExperiencia metodoa sobrekargatuta dagoela esaten da,
	 * bi aldiz inplementatuta dagoelako
	 * @param aniosExperiencia the aniosExperiencia to set
	 * 
	 */
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	

	
	

}
