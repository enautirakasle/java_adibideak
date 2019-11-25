package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Pertsona klaseko objetu bat sortu eraikitzailea (constructor) erabiliz.
		Pertsona p = new Pertsona("Iker");
		
		
		
		System.out.println("Idatzi adina");
		int adina = Integer.parseInt(scan.nextLine());
		
		p.setAdina(adina);
		
		System.out.println("Idatzi telefonoa");
		String tel = scan.nextLine();
		
		p.setTelefonoa(tel);
		
		System.out.println("Izena: " + p.getIzena());
		System.out.println("Adina: " + p.getAdina());
		System.out.println("Telf.: " +  p.getTelefonoa());
		
	
		
		
	}

}
