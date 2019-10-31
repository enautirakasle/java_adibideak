package adibideak;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * array bat fitxategi baten gorde
 */

public class Adibidea15 {

	public static void main(String[] args) {

		//arraya definitu eta bete
		String[] izenak = {"Markel", "Igor", "Iker", "Lander", "Eider"};
		
		//idazle objetua sortu
		File fitxategia = new File("datuak/adibidea15.txt");
		try {
			FileWriter fileWriter = new FileWriter(fitxategia);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			for(int i = 0; i < izenak.length; i++){
				printWriter.println(izenak[i]);
			}
			
			printWriter.close();
			fileWriter.close();

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
