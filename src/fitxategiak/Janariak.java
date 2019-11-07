package fitxategiak;

import java.io.File;
import java.io.FileNotFoundException;
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

		
		//datuen karga
		File file = new File("datuak/janariak.txt");
		try {
			Scanner scan = new Scanner(file);
			
			int i = 0;
			while(scan.hasNext()){
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
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//datuen karga bukatu
		
		
		//menua eta aukerak
		
		
		
		//datuak gorde
		
		
		
		

	

	}

}
