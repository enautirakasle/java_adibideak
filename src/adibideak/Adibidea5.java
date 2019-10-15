package adibideak;

import java.util.Scanner;

/*
 * switch case
 */
public class Adibidea5 {

	public static void main(String[] args) {
		System.out.println("sartu aukera 1 edo 2");
		Scanner scan = new Scanner(System.in);
		int aukera = Integer.parseInt(scan.nextLine());
		
		switch(aukera){
		case 1:
			System.out.println("Lehena aukeratu duzu");
			break;
		case 2:
			System.out.println("Bigarrena aukeratu duzu");
			break;
		default:
			System.out.println("Ez duzu 1 edo 2 aukeratu");
			break;
		}
		
		
	}

}
