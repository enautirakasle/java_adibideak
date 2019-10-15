package adibideak;

import java.util.Scanner;

public class Adibidea2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // deklaratu eta hasieratu
		/*
		 * stringa pantailatik irakurri
		 */
		String izena;

		System.out.println("Sartu izen bat");
		izena = scanner.nextLine(); // lerroa irakurri
		System.out.println("izena: " + izena); // pantailan idatzi

		/*
		 * zenbaki bat irakurri eta idatzi
		 */
		System.out.println("Sartu zenbaki bat");
		int adina = scanner.nextInt();
		System.out.println("adina: " + adina);

		/*
		 * zenbaki erreal bat irakurri
		 */
		System.out.println("Sartu zenbaki erreal bat");
		double tenperatura = scanner.nextDouble();
		System.out.println("tenperatura: " + tenperatura);

	}

}
