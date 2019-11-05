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
			
			
			//do{
				//menua erakutsi
				
				//aukera irakurri
				
				//switcha
				
			//}while();
			
//			for(int j = 0; j< izenak.length; j++){
//				System.out.println((j+1) + " " + izenak[j] +" "+ egoerak[j] + " " + motak[j]);
//			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
