package oop.herentzia;

public class Ballena extends Animal{

	private String oceano;

	/**
	 * @return the oceano
	 */
	public String getOceano() {
		return oceano;
	}

	public void sacarRuido(){
		System.out.println("Soy una ballena, glu glu glu.");
	}
	
	/**
	 * @param oceano the oceano to set
	 */
	public void setOceano(String oceano) {
		this.oceano = oceano;
	}
	
	
}
