package oop.herentzia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		Ballena b1 = new Ballena();
		
		b1.setNombreEspecie("ballena");
		b1.setNumPatas(0);
		
		a1.setNombreEspecie("burro");
		a1.setNumPatas(4);
	
		b1.setOceano("atlantico");
		
		Perro p1 = new Perro();
		p1.setNumPatas(4);
		p1.setRaza("caniche");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Idatzi txakurrak zenbat zaunka egitea nahi duzun");
		int numLadridos = Integer.parseInt(scan.nextLine());
		
		p1.ladrar(numLadridos);
		
		
		System.out.println();

	}

}
