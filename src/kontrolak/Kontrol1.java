package kontrolak;

import java.util.Scanner;
/*
 * 2019-10-28 konk kontrol baten ebazpena
 */
public class Kontrol1 {

	static final int SALIR = 0;
	static final int LISTAR = 1;
	static final int MAX_PRECIO = 2;
	static final int MIN_PIZZA = 3;
	static final int MEDIA_PRECIO = 4;

	public static void main(String[] args) {
		String[] pizzaIzenak = new String[3];
		double[] pizzaPrezioak = new double[3];
		Scanner scan = new Scanner(System.in);
		int aukera;

		for (int i = 0; i < pizzaIzenak.length; i++) {
			System.out.println("Introduce el nombre de la pizza");
			pizzaIzenak[i] = scan.nextLine();
			System.out.println("Sartu prezioa");
			pizzaPrezioak[i] = Double.parseDouble(scan.nextLine());
		}

		do {
			System.out.println("---Menu---\n" + SALIR + "-salir " + LISTAR + "-listar pizzas y precios " + MAX_PRECIO
					+ "-precio mas caro " + MIN_PIZZA + "-pizza mas barata " + MEDIA_PRECIO+ "-media de precios");
			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case LISTAR:
				listarPizzas(pizzaIzenak, pizzaPrezioak);
				break;
			case MAX_PRECIO:
				precioMasCaro(pizzaPrezioak);
				break;
			case MIN_PIZZA:
				pizzaMasBarata(pizzaIzenak, pizzaPrezioak);
				break;
			case MEDIA_PRECIO:
				mediaPrecio(pizzaPrezioak);
				break;
			case SALIR:
				System.out.println("El programa se ha cerrado....");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (aukera != SALIR);

	}

	private static void mediaPrecio(double[] pizzaPrezioak) {
		double batura = 0;
		for (int i = 0; i < pizzaPrezioak.length; i++) {
			batura = batura + pizzaPrezioak[i];
		}
		System.out.println("El precio medio de las pizzas es: " + batura/pizzaPrezioak.length);
		
	}

	private static void pizzaMasBarata(String[] pizzaIzenak, double[] pizzaPrezioak) {

		double prezioMin = pizzaPrezioak[0];

		int indicePezioMin = 0;
		for (int i = 0; i < pizzaPrezioak.length; i++) {
			if(prezioMin > pizzaPrezioak[i]) {
				prezioMin= pizzaPrezioak[i];
				indicePezioMin = i;
			}
		}
		
		System.out.println("La pizza mas barata es: " + pizzaIzenak[indicePezioMin]);
		
	}

	private static void precioMasCaro(double[] pizzaPrezioak) {
		double prezioMax = 0;
		for (int i = 0; i < pizzaPrezioak.length; i++) {
			if(prezioMax < pizzaPrezioak[i]) {
				prezioMax= pizzaPrezioak[i];
			}
		}
		System.out.println("La pizza mas cara vale: " + prezioMax);
		
	}

	private static void listarPizzas(String[] pizzaIzenak, double[] pizzaPrezioak) {
		for (int i = 0; i < pizzaPrezioak.length; i++) {
			System.out.println(pizzaIzenak[i] + ": " + pizzaPrezioak[i]);
		}
	}

}
