package adibideak;

import java.util.Scanner;

/*
 * for for for for for for for for for rrrrrrrrrrrr
 */
public class Adibidea8_1 {

	public static void main(String[] args) {
		String[] izenak = new String[5];
		Scanner scan = new Scanner(System.in);
		
		//datuak memorian kargatzea
		for(int i = 0; i < izenak.length; i++){
			izenak[i] = scan.nextLine();
		}
		
		
		//datuak memoraitik gorde 
		for(int i = 0; i < izenak.length; i++){
			if(izenak[i].length() > 5){//izenaren letrak 5 baino gehiago badira
				System.out.println(izenak[i]);//pantailan atera
			}
		}
		
	
		

	}

}
