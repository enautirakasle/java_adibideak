package oop.interfazeak;

public class Zirkunferentzia extends Figura implements Inprimagarria, Bidimensionala{
	
	private int erradioa;

	public Zirkunferentzia(int erradioa) {
		super();
		this.erradioa = erradioa;
	}

	@Override
	public void inprimatu() {
		System.out.println("    ****   ");
		System.out.println("   *     *    ");
		System.out.println("  *        *   ");
		System.out.println(" *          * ");
		System.out.println(" *          *");
		System.out.println("  *        * ");
		System.out.println("   *      *  ");
		System.out.println("     ****  ");
	}

	@Override
	public double area() {
		return erradioa * Math.sqrt(Math.PI);
	}
	
}
