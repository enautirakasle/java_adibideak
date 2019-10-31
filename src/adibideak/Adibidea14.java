package adibideak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * datuak fitxategitik irakurri eta pantailan idatzi
 */
public class Adibidea14 {

	public static void main(String[] args) {
		
		/*
		 * datuak_in.txt fitxategitik irakurri eta arrayan gorde
		 */
		//fitxategia zabaldu
		//File fitxategia = new File("C:/Users/ikaslea/Desktop/datuak.txt"); //ruta absolutua
		File fitxategia = new File("datuak/datuak_in.txt");//ruta erlatiboa ikusi proiektuko karpeta
		
		Scanner scan;
		String[] lerroak = new String[100];
		
		try {
			scan = new Scanner(fitxategia);
			String lerroa;
			int i = 0;
			
			//fitxategia errekorritu
			while(scan.hasNext()){//lerroren bat dagoen bitaretan
				//irakukrri lerroa
				lerroa = scan.nextLine();
				//idatzi lerroa
				System.out.println(lerroa);
				lerroak[i] = lerroa; //lerroa arrayko i-garren gelaxkan gorde
				i++;
			}

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		//arrayko datuak datuak_out.txt fitxategian gorde
		fitxategia = new File("datuak/datuak_out.txt");
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(fitxategia);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			for(int i = 0; i<lerroak.length; i++){
				if(lerroak[i] != null){
					printWriter.println(lerroak[i]);
				}
				
				
				
			}
			
			fileWriter.close();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}//main bukaera

}
