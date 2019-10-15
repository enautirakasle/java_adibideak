package adibideak;

import java.util.Scanner;

/*
 * ifekin adibideak
 */

public class Adibidea4 {

	/*
	 * bi zenbaki irakurri eta
	 * zenbakirik handiena pantailaratuko du
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sartu bi zenbaki");
		int n1 = Integer.parseInt(scan.nextLine());
		double n2 = Double.parseDouble(scan.nextLine());
		
		if(n1 < n2){
			System.out.println(n2);
		}else if (n1 > n2){
			System.out.println(n1);
		}else{
			System.out.println("berdina dira");
		}
		
		
	}
}
