package oop.abstraktuak;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = new Alumno("Markel", "33445566n");
		
		
		Modulo programacion = new Modulo("Programacion", 199);
		
		alumno.matricular(programacion);
		
		System.out.println();

	}

}
