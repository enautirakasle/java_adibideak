package oop.interfazeak;

public class Laukia extends Figura implements Inprimagarria, Bidimensionala{
	private int a;
	private int b;
	
	public Laukia(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double area() {
		return a*b;
	}
	@Override
	public void inprimatu() {
		System.out.println("******");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("******");
		
		
	}
	


}
