package oop.aurikularrak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static final int IRTEN = 0;
	private static final int CREATE = 1;
	private static final int READ = 2;
	private static final int UPDATE = 3;
	private static final int DELETE = 4;

	public static void main(String[] args) {

		Aurikular[] aurikularrak = new Aurikular[15];
		datuakKargatu(aurikularrak, "datuak/aurikularrak.txt");

		Scanner scan = new Scanner(System.in);

		int aukera;

		do {
			menuNagusia();
			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case IRTEN:
				agurra();
				break;
			case CREATE:
				aurikularraGehitu(aurikularrak);
				break;

			default:
				break;
			}

		} while (aukera != IRTEN);

	}// main

	private static void aurikularraGehitu(Aurikular[] aurikularrak) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Idatzi aurikular izena");
		String izena = scan.nextLine();

		System.out.println("Idatzi aurikular marka");
		String marka = scan.nextLine();

		System.out.println("Idatzi aurikular prezioa");
		double prezioa = Double.parseDouble(scan.nextLine());

		System.out.println("Idatzi aurikularren stocka");
		int stocka = Integer.parseInt(scan.nextLine());

		// aurikular objetua sortu
		Aurikular aurikularBerria = new Aurikular();

		// aurikular objetua bete erabiltzaileak sartutako datuekin
		aurikularBerria.setIzena(izena);
		aurikularBerria.setMarka(marka);
		aurikularBerria.setPrezioa(prezioa);
		aurikularBerria.setStocka(stocka);

		// arraya errekorritu eta lehen hutsunean gorde
//		for (int i = 0; i < aurikularrak.length; i++) {
//			if (aurikularrak[i] == null) {
//				aurikularrak[i] = aurikularBerria;
//				break;
//			}
//		}
		
		boolean gordeDa = false;
		int i = 0;
		while(i<aurikularrak.length && !gordeDa){
			if (aurikularrak[i] == null) {
				aurikularrak[i] = aurikularBerria;
				gordeDa = true;
			}
			i++;
		}

	}

	private static void menuNagusia() {
		System.out.println(CREATE + "- sortu");
		System.out.println(READ + "- kontsultak");
		System.out.println(UPDATE + "- aldaketak");
		System.out.println(DELETE + "- ezabatu");
		System.out.println(IRTEN + "- irten");

	}

	private static void agurra() {
		System.out.println("Programa zarratzen");

	}

	private static void datuakKargatu(Aurikular[] aurikularrak, String fitxategiIzena) {
		// fitxategia irakurri
		File file = new File(fitxategiIzena);
		Scanner scan;
		try {

			scan = new Scanner(file);
			String lerroa;
			String[] zatiak;
			Aurikular aurikularra;

			int i = 0;
			// lerro bakoitzeko
			while (scan.hasNext()) {
				// lerro bat irakurri
				lerroa = scan.nextLine();

				// lerroa zatitu
				zatiak = lerroa.split(";");

				// aurikular bat sortu
				aurikularra = new Aurikular();

				// objetua zatiekin bete(set set set set)
				aurikularra.setIzena(zatiak[0]);
				aurikularra.setMarka(zatiak[1]);
				aurikularra.setPrezioa(Double.parseDouble(zatiak[2]));
				aurikularra.setStocka(Integer.parseInt(zatiak[3]));

				// objetua arrayra sartu
				aurikularrak[i] = aurikularra;
				i++;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}// class
