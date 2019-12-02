package listaDinamikoak;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> izenak = new ArrayList<String>();

		izenak.add("Markel");
		izenak.add("Igor");
		izenak.add("Iker");

		// izenak.remove(2);

		pantailaratuSt1(izenak);
		pantailaratuSt2(izenak);

		ArrayList<Integer> zenbakiak = new ArrayList<Integer>();
		zenbakiak.add(23);
		zenbakiak.add(11);
		zenbakiak.add(67);

		pantailaratuZenb1(zenbakiak);
		pantailaratuZenb2(zenbakiak);
	}

	private static void pantailaratuZenb2(ArrayList<Integer> zenbakiak) {
		Iterator<Integer> i = zenbakiak.iterator();

		while (i.hasNext()) {
			int zenbakia = i.next();
			System.out.println(zenbakia);
		}

	}

	private static void pantailaratuZenb1(ArrayList<Integer> zenbakiak) {
		for (int i = 0; i < zenbakiak.size(); i++) {
			int zenbakia = zenbakiak.get(i);
			System.out.println(zenbakia);
		}

	}

	private static void pantailaratuSt2(ArrayList<String> stringLista) {
		Iterator<String> i = stringLista.iterator();

		while (i.hasNext()) {
			String katea = i.next();
			System.out.println(katea);
		}
	}

	private static void pantailaratuSt1(ArrayList<String> stringLista) {
		for (int i = 0; i < stringLista.size(); i++) {
			String katea = stringLista.get(i);
			System.out.println(katea);
		}
	}

}
