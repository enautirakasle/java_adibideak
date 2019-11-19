package fitxategiak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Janariak {

	public static void main(String[] args) {
		String lerroa;
		String[] zatiak;

		String[] izenak = new String[404];
		String[] egoerak = new String[404];
		double[] kaloriak = new double[404];
		double[] gantzak = new double[404];
		double[] proteinak = new double[404];
		double[] karbohidratoak = new double[404];
		String[] motak = new String[404];

		// datuen karga
		File file = new File("datuak/janariak.txt");
		try {
			Scanner scan = new Scanner(file);

			int i = 0;
			while (scan.hasNext()) {
				lerroa = scan.nextLine();
				zatiak = lerroa.split(";");

				izenak[i] = zatiak[0];
				egoerak[i] = zatiak[1];
				kaloriak[i] = Double.parseDouble(zatiak[2].replace(',', '.'));

				String proteinaKomarekin = zatiak[3];
				String proteinaPuntuarekin = zatiak[3].replace(',', '.');
				proteinak[i] = Double.parseDouble(proteinaPuntuarekin);

				gantzak[i] = Double.parseDouble(zatiak[4].replace(',', '.'));
				karbohidratoak[i] = Double.parseDouble(zatiak[5].replace(',', '.'));
				motak[i] = zatiak[6];

				i++;
			}
			scan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// datuen karga bukatu

		// menua eta aukerak
		Scanner scanTeklatua = new Scanner(System.in);
		int aukera;
		do {
			// menua erakutsi
			System.out.println("----MENUA----\n"
					+ "0-irten\n"
					+ "1- fruitu lehorrak zerrendatu\n"
					+ "2- kaloria gehien dituena ikusi\n"
					+ "3- janari motak zerrendatu\n"
					+ "4- kaloriak aldatu"
					+ "5- janariari propietateak aldatu");

			// aukera irakurri
			aukera = Integer.parseInt(scanTeklatua.nextLine());

			// switch batekin aukera bakoitza inplementatu
			switch (aukera) {
			case 1:
				fruituLehorrakZerrendatu(izenak, egoerak, kaloriak, gantzak, proteinak, karbohidratoak, motak);
				break;
			case 2:
				janariKalorikoenaBistaratu(izenak, egoerak, kaloriak, gantzak, proteinak, karbohidratoak, motak);
				break;
			case 3:
				janariMotakZerrendatu(motak);
				break;
			case 4:
				janariariKaloriakAldatu(izenak, egoerak, kaloriak);
				//datuakGorde(izenak, egoerak, kaloriak, gantzak, proteinak, karbohidratoak, motak);
				break;
			case 5:
				//TODO metodoa
				break;

			case 0:
				datuakGorde(izenak, egoerak, kaloriak, gantzak, proteinak, karbohidratoak, motak);
				System.out.println("Programa zarratzera doa...");
				break;
			default:
				System.out.println("Aukera okerra");
				break;
			}

		} while (aukera != 0);

	}// main bukaera

	private static void janariariKaloriakAldatu(String[] izenak, String[] egoerak, double[] kaloriak) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi janari izen bat");
		String izena = scan.nextLine();
		System.out.println("Idatzi janariaren egoera bat");
		String egoera = scan.nextLine();
		
		int janariIndezea = bilatuJanaria(izenak, egoerak, izena, egoera);
		
		if(janariIndezea != -1){
			//datuak erakutsi
			System.out.println(izenak[janariIndezea] + " - " + egoerak[janariIndezea] + ": " + kaloriak[janariIndezea] + " cal");
			
			//kalorien datu berria eskatu
			System.out.println("Idatzi kaloria berriak");
			double kaloriaBerriak = Double.parseDouble(scan.nextLine());
			
			//informazioa eguneratu
			kaloriak[janariIndezea] = kaloriaBerriak;
		}else{
			System.out.println("Janaria ez da aurkitu");
		}
		
		
	}

	private static int bilatuJanaria(String[] izenak, String[] egoerak, String izena, String egoera) {
		for(int i = 0; i< izenak.length; i++){
			if(izenak[i].equals(izena) && egoerak[i].equals(egoera)){
				return i; //janaria aurkitu da, i > 0
			}
		}
		return -1;
	}
	

	private static void janariMotakZerrendatu(String[] motak) {
		String[] motaDesberdinak = new String[50];
		for(int i = 0; i<motaDesberdinak.length; i++){
			motaDesberdinak[i] = "";
		}
		
		int kont = 0;
		
		for(int i = 0; i<motak.length; i++){
			if(!badago(motak[i], motaDesberdinak)){
				
				motaDesberdinak[kont] = motak[i];
				kont++;
			}
			
		}
		
		//motaDesberdinakInprimatu
		for(int i = 0; i< motaDesberdinak.length;i++){
			if(motaDesberdinak[i].equals("")){
				break;
			}
			System.out.println(motaDesberdinak[i]);
			
		}
		
	}

	private static boolean badago(String mota, String[] motaDesberdinak) {
		for(int i =0; i<motaDesberdinak.length;i++){
			if(motaDesberdinak[i] == null){
				return false;
			}
			if(motaDesberdinak[i].equals(mota)){
				return true;
			}
		}
		
		return false;
	}

	private static void janariKalorikoenaBistaratu(String[] izenak, String[] egoerak, double[] kaloriak,
			double[] gantzak, double[] proteinak, double[] karbohidratoak, String[] motak) {
		
		double kaloriaMax = 0;
		int iMax = -1;
		for(int i = 0; i < izenak.length; i++){
			if(kaloriaMax < kaloriak[i]){
				kaloriaMax = kaloriak[i];
				iMax = i;
			}
		}
		System.out.println(izenak[iMax] +  " " + egoerak[iMax] + ": " + kaloriak[iMax] + " cal");
		
	}

	private static void datuakGorde(String[] izenak, String[] egoerak, double[] kaloriak, double[] gantzak,
			double[] proteinak, double[] karbohidratoak, String[] motak) {

		
		File file = new File("datuak/janariak.txt");
		try {
			PrintWriter printWriter = new PrintWriter(file);
			
			for (int i = 0; i < izenak.length; i++) {

				String lerroa = izenak[i] + ";" + egoerak[i] + ";" + kaloriak[i] + ";" 
						+ proteinak[i] + ";" + gantzak[i]
						+ ";" + karbohidratoak[i] + ";" + motak[i];
				printWriter.println(lerroa.replace('.', ','));

			}
			printWriter.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	static void fruituLehorrakZerrendatu(String[] izenak, String[] egoerak, double[] kaloriak, double[] gantzak,
			double[] proteinak, double[] karbohidratoak, String[] motak) {

		for (int i = 0; i < izenak.length; i++) {

			if (motak[i].equals("fruto seco")) {
				System.out.println(
						"Janari izena: " + izenak[i] + "\n\tEgoera: " + egoerak[i] + "\n\tKaloriak: " + kaloriak[i]);
			}

		}

	}// fruituLehorrakZerrendatu bukaera

}// class bukaera
