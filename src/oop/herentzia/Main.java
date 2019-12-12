package oop.herentzia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setNombreEspecie("burro");
		
		Ballena b1 = new Ballena();
		b1.setNombreEspecie("ballena blanca");
		
		Ornitorrinco o1 = new Ornitorrinco();
		o1.setNombreEspecie("ornitorrinco");
		
		a1.sacarRuido();
		b1.sacarRuido();
		o1.sacarRuido();

		
		
		System.out.println();

	}

}
