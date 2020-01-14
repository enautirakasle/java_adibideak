package oop.herentzia.football;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static final int SALIR = 0;
	static final int FUTOBOLISTA_SORTU = 1;
	static final int ENTRENATZAILEA_SORTU = 2;
	static final int MASAJISTA_SORTU = 3;
	static final int ZERRENDATU = 4;
	static final int KONTZENTRATU = 5;

	public static void main(String[] args) {
		// pertsonaz osatutako array bat definitu
		ArrayList<Persona> personal = new ArrayList<Persona>();

		Scanner scan = new Scanner(System.in);
		int aukera;

		do {
			menuNagusia();
			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case FUTOBOLISTA_SORTU:
				Futbolista futbolista = futbolistaSortu();
				personal.add(futbolista);
				
				break;
			case ENTRENATZAILEA_SORTU:
				Entrenador entrenador = entrenatzaileaSortu();
				personal.add(entrenador);
				
				break;
			case MASAJISTA_SORTU:
				Masajista masajista = masajistaSortu();
				personal.add(masajista);
				
				break;
			case ZERRENDATU:
				for (int i = 0; i < personal.size(); i++) {
					Persona per = personal.get(i);
					System.out.println(per);
				}
				
				break;
			case KONTZENTRATU:
				for (int i = 0; i < personal.size(); i++) {
					personal.get(i).concentrarse();
				}
				
				break;
			default:
				break;
			}

		} while (aukera != SALIR);
		

	}

	private static Masajista masajistaSortu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi masajista izena");
		String izena = scan.nextLine();
		
		System.out.println("Idatzi masajista abizenak");
		String abizenak = scan.nextLine();
		
		System.out.println("Idatzi titulazioa");
		String titulazioa = scan.nextLine();
		
		System.out.println("Idatzi zenbat ureko esperientzia duen");
		int urteak = Integer.parseInt(scan.nextLine());
		
		Masajista masajista = new Masajista();
		masajista.setNombre(izena);
		masajista.setApellidos(abizenak);
		masajista.setTitulacion(titulazioa);
		masajista.setAniosExperiencia(urteak);
				
		return masajista;
	}

	private static Entrenador entrenatzaileaSortu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi entrenatzailearen izena");
		String izena = scan.nextLine();
		
		System.out.println("Idatzi entrenatzailearen abizenak");
		String abizenak = scan.nextLine();
		
		System.out.println("Idatzi federazio zenbakia");
		String idFederado = scan.nextLine();
		
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre(izena);
		entrenador.setApellidos(abizenak);
		entrenador.setIdFederacion(idFederado);
		
		return entrenador;
	}

	private static Futbolista futbolistaSortu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi futbolariaren izena");
		String izena = scan.nextLine();
		
		System.out.println("Idatzi futbolariaren abizenak");
		String abizenak = scan.nextLine();
		
		System.out.println("Idatzi ze dorsal zenbaki duen");
		int dorsal = Integer.parseInt(scan.nextLine());
		
		System.out.println("Idatzi ze postutan jokatzen duen");
		String postua = scan.nextLine();
		
		Futbolista futbolista = new Futbolista();
		futbolista.setNombre(izena);
		futbolista.setApellidos(abizenak);
		futbolista.setDorsal(dorsal);
		futbolista.setPosicion(postua);
		
		return futbolista;
	}

	private static void menuNagusia() {
		System.out.println("-----MENU-------");

		System.out.print(FUTOBOLISTA_SORTU + "- futbolista   ");
		System.out.print(ENTRENATZAILEA_SORTU + "- entrenatzailea   ");
		System.out.print(MASAJISTA_SORTU + "- masajista   ");
		System.out.print(ZERRENDATU + "- zerrendatu   ");
		System.out.print(KONTZENTRATU + "- kontzentratu   ");
		System.out.print(SALIR + "- irten   \n");

	}

}
