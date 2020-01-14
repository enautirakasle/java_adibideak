package oop.herentzia.football;

public class Entrenador extends Persona{
	
	private String idFederacion;

	public void concentrarse(){
		System.out.println("Soy entrenador y estoy concentrandome.");
	}
	
	public void viajar(){
		System.out.println("Soy entrenador y realizado un viaje.");
	}
	
	/**
	 * @return the idFederacion
	 */
	public String getIdFederacion() {
		return idFederacion;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + getNombre() +", apellidos="+ getApellidos() 
				+ ",idFederacion=" + idFederacion + "]";
	}

	/**
	 * @param idFederacion the idFederacion to set
	 */
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}


	public void dirigirPartido(){
		System.out.println("He dirigido un partido");
	}
	

}
