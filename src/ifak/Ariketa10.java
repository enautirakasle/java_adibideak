package ifak;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {
		
		
		//karakterea irakurri
		String letra;
		System.out.println("Sartu letra bat");
		Scanner scan = new Scanner(System.in);
		letra = scan.nextLine();
		
		
		if("a".equals(letra) || letra.equals("e") || letra.equals("i")
				|| letra.equals("o") || letra.equals("u")){
			System.out.println("bokala da");
		}else{
			System.out.println("kontsonantea da");
		}

	}

}