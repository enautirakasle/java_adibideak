package ifak;

import java.util.Scanner;

/*
 * 11 ariketa
 * erabiltzaile eta pasahitza eskatu
 * eta zuzenak badira ok bestela ez ok
 */
public class Ariketa11 {
	public static void main(String[] args) {
		// erab eta pasahitz zuzenak
		String erabiltzaileZuzena = "ikaslea";
		String pasahitzZuzena = "ik2019";
		
		String erabiltzailea, pasahitza;
		
		//erabiltzaile eta pasahitza irakurri
		Scanner scan = new Scanner(System.in);
		System.out.println("Idatzi erabiltzailea");
		erabiltzailea = scan.nextLine();
		
		System.out.println("Idatzi pasahitza");
		pasahitza = scan.nextLine();
		
		if(erabiltzailea.equals(erabiltzaileZuzena) && pasahitza.equals(pasahitzZuzena)){
			System.out.println("Sisteman sartu zara.");
		}else{
			System.out.println("Erabiltzaile edo pasahitz okerra.");
		}
		

	}
}
