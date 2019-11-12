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
			System.out.println("----MENUA----\n0-irten\n1- fruitu lehorrak zerrendatu");

			// aukera irakurri
			aukera = Integer.parseInt(scanTeklatua.nextLine());

			// switch batekin aukera bakoitza inplementatu
			switch (aukera) {
			case 1:
				fruituLehorrakZerrendatu(izenak, egoerak, kaloriak, gantzak, proteinak, karbohidratoak, motak);
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
