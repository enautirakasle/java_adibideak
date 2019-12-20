package oop.interfazeak;

public class Kuboa extends Figura implements Inprimagarria, Tridimensionala{
	private int a;
	private int b;
	private int z;
	

	public Kuboa(int a, int b, int z) {
//		super();
		this.a = a;
		this.b = b;
		this.z = z;
	}
	
	@Override
	public double bolumena() {
		return a*b*z;
	}
	@Override
	public void inprimatu() {
		System.out.println("Kubo bat naiz");
		
	}
	
	
}
