package oop.herentzia;

public class Ornitorrinco extends Animal{

	private boolean enReserva;
	private int peso;	//en gramos
	
	void darDeComer(int gramos){
		this.peso = this.peso + gramos;
	}
	
	
	/**
	 * @return the enReserva
	 */
	public boolean isEnReserva() {
		return enReserva;
	}
	/**
	 * @param enReserva the enReserva to set
	 */
	public void setEnReserva(boolean enReserva) {
		this.enReserva = enReserva;
	}
	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
