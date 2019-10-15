package adibideak;

import java.util.Scanner;

/*
 * Do While adibidea
 */
public class Adibidea7 {

	public static void main(String[] args) {
		final int IRTEN = 0;
		
		Scanner scan = new Scanner(System.in);
		int aukera, kont;
		
		kont = 0;
		
		do{
			System.out.println("Sartu aukera bat");
			aukera = Integer.parseInt(scan.nextLine());
			kont++;
			
		}while(aukera != IRTEN);
		
		System.out.println("Agur, " + (kont-1) + " zenbaki sartu dituzu");
	}

}
