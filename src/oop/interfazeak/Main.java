package oop.interfazeak;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		

		Laukia l1 = new Laukia(5, 5);
		Laukia l2 = new Laukia(2, 5);
		Laukia l3 = new Laukia(3, 4);
		
		Erronboa e1 = new Erronboa(4, 10);
		
		Zirkunferentzia z1 = new Zirkunferentzia(4);
		
		
		ArrayList<Laukia> laukiak = new ArrayList<Laukia>();
		
		laukiak.add(l1);
		laukiak.add(l2);
		laukiak.add(l3);
		
		laukiak.sort(new LaukiComparator());
		
		System.out.println();
		
		

	}

}
