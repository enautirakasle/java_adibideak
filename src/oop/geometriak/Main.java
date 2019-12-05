package oop.geometriak;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Idatzi laukizuzenaren alde bat");
		int aldea1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Idatzi laukizuzenaren beste aldea");
		int aldea2 = Integer.parseInt(scan.nextLine());
		
		//Laukizuzen objektu bat sortu aldeak parametro bezala pasata
		Laukizuzena laukizuzena = new Laukizuzena(aldea1, aldea2);
		
		//azalera parametroa erabilita azalera pantailaratu
		System.out.println("Laukizuzenaren azalera " + laukizuzena.azalera() + "cm" + (char)178 + " da");
		
		//perimetroa pantailaratu perimetroa metodoa erabilita
		System.out.println("Laukizuzenaren azalera " + laukizuzena.perimetroa() + "cm da");
		
		

		laukizuzena.aldeakTrukatu();

		
		int lag = laukizuzena.getA();
		laukizuzena.setA(laukizuzena.getB());
		laukizuzena.setB(lag);
		
		

	}

}
