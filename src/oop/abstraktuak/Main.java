package oop.abstraktuak;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> pertsonak = new ArrayList<Persona>();
		
		Alumno a1 = new Alumno("Marakel", "11111111a");
		Alumno a2 = new Alumno("Igor", "22222222b");
		
		Profesor p1 = new Profesor("Anable", "33333333c");
		Profesor p2 = new Profesor("Eñaut", "44444444d");
		
		pertsonak.add(a1);
		pertsonak.add(p1);
		pertsonak.add(a2);
		pertsonak.add(p2);
		
		for (int i = 0; i < pertsonak.size(); i++) {
			pertsonak.get(i).esan("Kaixo");
		}
		
		

	}

}
