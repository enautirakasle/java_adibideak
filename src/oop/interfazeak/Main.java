package oop.interfazeak;

public class Main {

	public static void main(String[] args) {
		
		Kuboa k1 = new Kuboa(2, 4, 5);
		
		Laukia l1 = new Laukia(5, 5);
		
		Erronboa e1 = new Erronboa(4, 10);
		
		Zirkunferentzia z1 = new Zirkunferentzia(4);
		
		e1.inprimatu();
		l1.inprimatu();
		k1.inprimatu();
		z1.inprimatu();
		
		

	}

}
