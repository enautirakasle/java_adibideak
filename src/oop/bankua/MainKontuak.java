package oop.bankua;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainKontuak {
	
	static final int IRTEN = 0;
	static final int KONTUA_SORTU = 1;
	static final int KONTUA_EZABATU = 2;
	
	static final int KONTUA_IKUSI = 3;
	static final int INGRESOA_EGIN = 4;
	static final int DIRUA_ATERA = 5;
	
	
	public static void main(String[] args) {
		ArrayList<KontuKorrontea> kontuKorronteak = new ArrayList<KontuKorrontea>();
		
		
		datuakKargatu(kontuKorronteak);
		

		
		Scanner scan = new Scanner(System.in);
		int aukera;
		do{
			menuNagusia();
			aukera = Integer.parseInt(scan.nextLine());
			
			switch (aukera) {
			case INGRESOA_EGIN:
				ingresoaEgin(kontuKorronteak);
				
				break;
			case DIRUA_ATERA:
				diruaAtera(kontuKorronteak);
				break;
			case KONTUA_IKUSI:
				kontuaIkusi(kontuKorronteak);
				break;

			default:
				System.out.println("Aukera okerra");
				break;
			}
		}while(aukera!=IRTEN);

		datuakGorde(kontuKorronteak);
		
		
		
	}
	
	private static void diruaAtera(ArrayList<KontuKorrontea> kontuKorronteak) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi dirua atera nahi den kontuaren zenbakia");
		String kontuZenbakia = scan.nextLine();
		
		KontuKorrontea kontuKorrontea = null;
		boolean aurkitua = false;
		//kontuZenbakia kontuKorronteak arrayan bilatu eta informazioa pantailaratu.
		for (int i = 0; i < kontuKorronteak.size(); i++) {
			kontuKorrontea = kontuKorronteak.get(i);

			if(kontuKorrontea.getKontuZenbakia().equals(kontuZenbakia)){//kontuZenbakia eta uneko Kontu koroontearen zenbakia berdinak badira
				aurkitua= true;
				break;
			}	
		}
		
		if(aurkitua){
			kontuKorrontea.pantailaratu();
			
			System.out.println("Zenbat diru atera nahi duzu?");
			double kopurua = Double.parseDouble(scan.nextLine());
						
			if (!kontuKorrontea.saldoaGorrian()){
				kontuKorrontea.diruaAtera(kopurua);
				kontuKorrontea.pantailaratu();
			}else{
				System.out.println("Ezin da dirurik atera!!! Saldoa gorrian");
			}
		}else{
			System.out.println(kontuZenbakia + " ez da existitzen");
		}
		

	}

	private static void kontuaIkusi(ArrayList<KontuKorrontea> kontuKorronteak) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi kontsultatu nahi den kontuaren zenbakia");
		String kontuZenbakia = scan.nextLine();
		
		for (int i = 0; i < kontuKorronteak.size(); i++) {
			KontuKorrontea kontuKorrontea = kontuKorronteak.get(i);

			if(kontuKorrontea.getKontuZenbakia().equals(kontuZenbakia)){//kontuZenbakia eta uneko Kontu koroontearen zenbakia berdinak badira
				kontuKorrontea.pantailaratu();
				break;
			}	
		}
		
		
	}

	private static void ingresoaEgin(ArrayList<KontuKorrontea> kontuKorronteak) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi ingresoa egin nahi den KK zenbakia");
		String kontuZenbakia = scan.nextLine();
		
		System.out.println("Idatzi ingresatu nahi den diru kopurua");
		double kopurua = Double.parseDouble(scan.nextLine());
		
		for (int i = 0; i < kontuKorronteak.size(); i++) {
			KontuKorrontea kontuKorrontea = kontuKorronteak.get(i);

			if(kontuKorrontea.getKontuZenbakia().equals(kontuZenbakia)){//kontuZenbakia eta uneko Kontu koroontearen zenbakia berdinak badira
				//ingresaoa egin eta forretik atera
				kontuKorrontea.ingresatu(kopurua);
				
				System.out.println("Ingresoa egin da");
				kontuKorrontea.pantailaratu();
				
				break;
			}	
		}

	}

	static void menuNagusia(){

		System.out.println("--Menua--\n"
				+ INGRESOA_EGIN + "- ingresoa egin"
				+ DIRUA_ATERA + " - dirua atera"
				+ KONTUA_IKUSI + "- kontua ikusi"
				+ IRTEN + " - irten");
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
