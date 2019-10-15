package whileak;

import java.util.Scanner;

public class Ariketa23 {

	public static void main(String[] args) {
		// erab eta pasahitz zuzenak
		final String ERAB_ZUZENA = "ikaslea";
		final String PAS_ZUZENA = "ik2019";

		String erabiltzailea, pasahitza;
		Scanner scan = new Scanner(System.in);

		do{
			// erabiltzaile eta pasahitza irakurri
			System.out.println("Idatzi erabiltzailea");
			erabiltzailea = scan.nextLine();
			System.out.println("Idatzi pasahitza");
			pasahitza = scan.nextLine();
			
			if(!erabiltzailea.equals(ERAB_ZUZENA) || !pasahitza.equals(PAS_ZUZENA)){
				System.out.println("Erabiltzaile edo pasahitz okerra.");
			}
			
			
		}while(!erabiltzailea.equals(ERAB_ZUZENA) || !pasahitza.equals(PAS_ZUZENA));
		
		System.out.println("Systeman zaude, agur");
		//menu bat erakutsi aukerekin
		//programa hemen hasiko litzateke
	}

}
