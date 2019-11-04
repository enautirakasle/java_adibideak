package fitxategiak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LangabeziDatuak {

	public static void main(String[] args) {

		String lerroa;
		String[] zatiak;
		
		String[] herriak = new String[251];
		int[] langabetuak = new int[251];
		String[] probintziak = new String[251];
		
		//fitxategia irakurtzeko moduan zabaldu
		File file = new File("datuak/numParados2018Enero.csv");
		
		try {
			Scanner scan = new Scanner(file);
			
			//fitxategiaren lerro bakoitzeko
			int i = 0;
			while(scan.hasNext()){
				
				lerroa = scan.nextLine();	//lerroa irakurri
				
				zatiak = lerroa.split(";");	//lerroa zatitu
				
				//zati bakoitza dagokion arrayen gorde
				herriak[i] = zatiak[0];
				langabetuak[i] = Integer.parseInt(zatiak[1]);
				probintziak[i] = zatiak[2];
				
				i++;
				
				
			}
			
			//datuak pantailaratu
			//datuakPantailaratu(herriak, langabetuak, probintziak);
			
			probintziakoDatuakPantailaratu(herriak, langabetuak, probintziak, "gipuzkoa");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

	private static void probintziakoDatuakPantailaratu(String[] herriak, int[] langabetuak, String[] probintziak,
			String probintziaIzena) {
		
		for(int i =0; i< herriak.length; i++){
			if(probintziak[i].equals(probintziaIzena)){
				System.out.println(herriak[i] + " - " + langabetuak[i] + " - " + probintziak[i]);
			}
		}
		
	}

	private static void datuakPantailaratu(String[] herriak, int[] langabetuak, String[] probintziak) {
		for(int i =0; i< herriak.length; i++){
			System.out.println(herriak[i] + " - " + langabetuak[i] + " - " + probintziak[i]);
		}
		
	}

}
