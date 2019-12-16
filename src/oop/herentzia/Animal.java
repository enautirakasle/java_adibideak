package oop.herentzia;

public class Animal {

	private String nombreEspecie;
	private int numPatas;
	
	public void sacarRuido(){
		System.out.println("Soy un animaaaal! Un " + this.nombreEspecie + ", iuuuuuujuuuuu!!!");
	}

	/**
	 * @return the nombreEspecie
	 */
	public String getNombreEspecie() {
		return nombreEspecie;
	}

	@Override
	public String toString() {
		return "---Animal--- \n"
				+ "nombre de la especie=" + nombreEspecie + ", Numero de patas=" + numPatas + "]";
	}

	/**
	 * @param nombreEspecie the nombreEspecie to set
	 */
	public void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}
	/**
	 * @return the numPatas
	 */
	public int getNumPatas() {
		return numPatas;
	}
	/**
	 * @param numPatas the numPatas to set
	 */
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	
}
