package oop.bankua;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainKontuTraining {

	public static void main(String[] args) {
		
		ArrayList<KontuKorrontea> kontuak = new ArrayList<KontuKorrontea>();
		datuakKargatu(kontuak);
		
		//titular izen bat eskatu eta titular horren kontuak pantailaratu
		
		//saldo negatiboa duten kontuak pantailaratu
		
		//saloden media pantailaratu
		
		//saldoen batura pantailaratu
		
		//kontu zenbaki bat eskatu eta kontu horren informazioa pantailaratu
		
		//titular bat eskatu eta zenbat kontu dituen pantaialaratu.
		
		//titular bat eskatu eta saldo gorrian zenbat kontu dituen pantailaratu
		
		//titular bat eskatu eta bere kontu guztien saldo batura eta media egin
		
		//------sakontzeko.
		//titular bat eskatu eta kontu bat baino gehiago baditu bere saldo guztia kontu baten sartu eta beste kontuak ezabatu
		
		
		

	
	}
	
	
	/*
	 * Author: Galdez Gomez
	 */
	private static void datuakKargatu(ArrayList<KontuKorrontea> kontuak) {
		File fitxategia = new File("datuak/kontuak.txt");
		try {
			Scanner scan = new Scanner(fitxategia);
			String lerroa;
			String[] zatiak;
			KontuKorrontea kontuKorrontea;

			while (scan.hasNext()) {
				lerroa = scan.nextLine();
				zatiak = lerroa.split(";");
				kontuKorrontea = new KontuKorrontea();
				kontuKorrontea.setKontuZenbakia(zatiak[0]);
				kontuKorrontea.setTitularIzena(zatiak[1]);
				kontuKorrontea.setSaldoa(Double.parseDouble(zatiak[2]));
				kontuKorrontea.setUrtekoInteresa(Double.parseDouble(zatiak[3]));

				kontuak.add(kontuKorrontea);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * Author: Galdez Gomez
	 */
	private static void datuakGorde(ArrayList<KontuKorrontea> kontuak) {
		try {
			PrintWriter writer = new PrintWriter("datuak/kontuak.txt");

			String lerroa;
			for (int i = 0; i < kontuak.size(); i++) {
				lerroa = kontuak.get(i).getKontuZenbakia() + ";" + kontuak.get(i).getTitularIzena() + ";"
						+ kontuak.get(i).getSaldoa() + ";" + kontuak.get(i).getUrtekoInteresa();
				writer.println(lerroa);

			}

			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	
}
