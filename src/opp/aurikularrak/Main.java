package opp.aurikularrak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//debinitu aurikularrez osatutako 10eko array bat
		Aurikular[] aurikularrak = new Aurikular[10];
		
		//fitxategia irakurri
		File file = new File("datuak/aurikularrak.txt");
		Scanner scan;
		try {
			
			scan = new Scanner(file);
			String lerroa;
			String[] zatiak;
			Aurikular aurikularra;
			
			int i = 0;
			//lerro bakoitzeko
			while(scan.hasNext()){
				//lerro bat irakurri
				 lerroa = scan.nextLine();
				 
				//lerroa zatitu
				 zatiak = lerroa.split(";");
				 
				//aurikular bat sortu
				 aurikularra = new Aurikular();
				 
				//objetua zatiekin bete(set set set set)
				 aurikularra.setIzena(zatiak[0]);
				 aurikularra.setMarka(zatiak[1]);
				 aurikularra.setPrezioa(Double.parseDouble(zatiak[2]));
				 aurikularra.setStocka(Integer.parseInt(zatiak[3]));
				 
				//objetua arrayra sartu
				 aurikularrak[i] = aurikularra;
				 i++;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		//arraya pantailaratu
		

	}

}
