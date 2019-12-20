package oop.interfazeak;

public class Erronboa extends Figura implements Bidimensionala, Inprimagarria{
	
	private int diagonalA;
	private int diagonalB;
	
	public Erronboa(int diagonalA, int diagonalB) {
		super();
		this.diagonalA = diagonalA;
		this.diagonalB = diagonalB;
	}
	@Override
	public void inprimatu() {
		System.out.println("Erronbo bat naiz");
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (diagonalA*diagonalB)/2;
	}
}
