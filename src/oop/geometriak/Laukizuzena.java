package oop.geometriak;

public class Laukizuzena {

	//atributuak
	public int a;
	public int b;
	
	//metodoak
	public Laukizuzena(){

	}
	public Laukizuzena(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int azalera(){
		return a*b;
	}
	
	public int perimetroa(){
		return (a*2) + (b*2);
	}
	
	public void aldeakTrukatu(){
		int lag = this.a;
		this.a = this.b;
		this.b = lag;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
