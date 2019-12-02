package opp.aurikularrak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAList {
	private static final int IRTEN = 0;
	private static final int CREATE = 1;
	private static final int READ = 2;
	private static final int UPDATE = 3;
	private static final int DELETE = 4;

	public static void main(String[] args) {

		ArrayList<Aurikular> aurikularrak = new ArrayList<Aurikular>();
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

	private static void aurikularraGehitu(ArrayList<Aurikular> aurikularrak) {
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

		aurikularrak.add(aurikularBerria);
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

	private static void datuakKargatu(ArrayList<Aurikular> aurikularrak, String fitxategiIzena) {
		// fitxategia irakurri
		File file = new File(fitxategiIzena);
		Scanner scan;
		try {

			scan = new Scanner(file);
			String lerroa;
			String[] zatiak;
			Aurikular aurikularra;


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
				aurikularrak.add(aurikularra);


			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}// class
