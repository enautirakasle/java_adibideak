package oop.herentzia;

public class Perro extends Animal{
	
	private String raza;
	
	public void ladrar(int kantidad){
		
		for (int i = 0; i < kantidad; i++) {
			System.out.print("Uau ");
		}
		System.out.println();
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
}
