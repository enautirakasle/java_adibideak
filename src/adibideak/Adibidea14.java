package adibideak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * datuak fitxategitik irakurri eta pantailan idatzi
 */
public class Adibidea14 {

	public static void main(String[] args) {
		//fitxategia zabaldu
		File fitxategia = new File("C:/Users/ikaslea/Desktop/datuak.txt");
		File fitx1 = new File("datuak/datuak.txt");//ruta erlatiboa ikusi proiektuko karpeta
		Scanner scan;
		String[] lerroak = new String[100];
		
		try {
			scan = new Scanner(fitxategia);
			String lerroa;
			int i = 0;
			while(scan.hasNext()){//lerroren bat dagoen bitaretan
				//irakukrri lerroa
				lerroa = scan.nextLine();
				//idatzi lerroa
				System.out.println(lerroa);
				lerroak[i] = lerroa;
				i++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}//main bukaera

}
