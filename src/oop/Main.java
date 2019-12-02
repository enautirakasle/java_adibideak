package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Pertsona klaseko objetu bat sortu eraikitzailea (constructor) erabiliz.
		Pertsona p = new Pertsona();
		p.getIzena();
		
		Pertsona galder = new Pertsona();
		galder.setIzena("Galder");
		
		Pertsona enaut = new Pertsona();
		enaut.setIzena("Enaut");
		
	
		System.out.println(galder.getIzena());
	
	}

}
