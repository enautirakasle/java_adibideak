package listaDinamikoak;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> izenak = new ArrayList<String>();
		
		izenak.add("Markel");
		izenak.add("Igor");
		izenak.add("Iker");
		
		//izenak.remove(2);
		
		pantailaratu1(izenak);
		pantailaratu2(izenak);
	}

	private static void pantailaratu2(ArrayList<String> stringLista) {
		Iterator<String> i = stringLista.iterator();
		
		while(i.hasNext()){
			String katea = i.next();
			System.out.println(katea);
		}
	}

	private static void pantailaratu1(ArrayList<String> stringLista) {
		for(int i = 0; i<stringLista.size(); i++){
			String katea = stringLista.get(i);
			System.out.println(katea);
		}
	}

}
