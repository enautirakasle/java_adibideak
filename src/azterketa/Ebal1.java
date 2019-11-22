package azterketa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ebal1 {

	
	public static void main(String[] args) {
		
		final int PRODUKTU_KOP = 10;
		
		
		String[] nombresProductos = new String[PRODUKTU_KOP];
		String[] marcas = new String[PRODUKTU_KOP];
		double[] precios = new double[PRODUKTU_KOP];
		int[] stocks = new int[PRODUKTU_KOP];
		
		//datuak kargatu
		datuakKargatu(nombresProductos, marcas, precios, stocks);
		
		
		//menua eta swichak
		int aukera;
		Scanner scan = new Scanner(System.in);
		do{
			
			menuaErakutsi();
			aukera = Integer.parseInt(scan.nextLine());
			
			switch (aukera) {
			case 1:
				denetzakoDirua(precios, stocks);
				break;
			case 2:
				garestiak(nombresProductos, marcas, precios, stocks);
				break;
			case 3:
				stockaGutxitu(nombresProductos, stocks);
				break;
			case 4:
				bilatzailea(nombresProductos, marcas, precios, stocks);
				break;
			default:
				System.out.println("aukera okerra");
				break;
			}
			
		}while(aukera != 0);
		
		//gorde
		guardarDatos(nombresProductos, marcas, precios, stocks);

	}
	
	private static void bilatzailea(String[] nombresProductos, String[] marcas, double[] precios, int[] stocks) {
		
		//erabiltzaileari eskatu kate bat sartzeko
		System.out.println("Idatzi zerbait");
		
		//irakurri eta aldagai baten gorde
		Scanner scan = new Scanner(System.in);
		String katea = scan.nextLine();
		
		for (int i = 0; i < stocks.length; i++) {
			if(nombresProductos[i].toLowerCase().contains(katea.toLowerCase()) || marcas[i].toLowerCase().contains(katea.toLowerCase())){
				aurikularraPantailaratu(nombresProductos[i], marcas[i], precios[i], stocks[i]);
			}
		}
		
		
		
	}

	private static void menuaErakutsi() {
		System.out.println("MENUA\n"
				+ "1- denentzako dirua\n"
				+ "2- garestienak\n"
				+ "3- stocka gutxitu\n"
				+ "4- bilatzailea"
				+ "0 - irten\n");
		
	}

	private static void stockaGutxitu(String[] nombresProductos, int[] stocks) {
		//izena eskatu
		System.out.println("Idati produktu izen bat");
		
		//izena irakurri
		Scanner scan = new Scanner(System.in);
		String izena = scan.nextLine();
		
		//productua bilatu
		//stocka 0 baino handiagoa bada
		//	stocka gutxitu
		
		for (int i = 0; i < stocks.length; i++) {
			if(nombresProductos[i].equals(izena) && stocks[i] > 0){
				stocks[i] = stocks[i] - 1 ;
			}else if(nombresProductos[i].equals(izena) && stocks[i] == 0){
				System.out.println(izena + "-en stocka ezin da gutxitu 0 delako");
			}
		}
		
	}

	private static void garestiak(String[] nombresProductos, String[] marcas, double[] precios, int[] stocks) {
		double media = prezioMedia(precios);
		
		for (int i = 0; i < stocks.length; i++) {
			if(media < precios[i]){
				aurikularraPantailaratu(nombresProductos[i], marcas[i], precios[i], stocks[i]);
			}
		}
		
		
	}

	private static void aurikularraPantailaratu(String nombresProducto, String marca, double precio,
			int stock) {
		System.out.println(nombresProducto + " - " + marca + ": " + precio + " Euros. Unidades disponibles: " +stock);
		
	}

	private static double prezioMedia(double[] precios) {
		double batura = 0;
		for (int i = 0; i < precios.length; i++) {
			batura = batura + precios[i];
		}
		
		return batura / precios.length;
	}

	private static void denetzakoDirua(double[] precios, int[] stocks) {
		double batura = 0;
		for (int i = 0; i < stocks.length; i++){
			batura = batura  + (precios[i] * stocks[i]);
		}
		
		System.out.println("denetara: " + batura);
		
	}

	static void datuakKargatu(String[] izenak, String[] markak, double[] prezioak ,int[] stockak){

		File file = new File("datuak/aurikulares.txt");
		try {
			Scanner scan = new Scanner(file);
			String linea = null;
			String[] partes = null;
			int i = 0;
			while (scan.hasNext()) {
				linea = scan.nextLine();
				partes = linea.split(";");

				izenak[i] = partes[0];
				markak[i] = partes[1];
				prezioak[i] = Double.parseDouble(partes[2]);
				stockak[i] = Integer.parseInt(partes[3]);

				i++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void guardarDatos(String[] productos, String[] marcas, double[] precios, int[] stocks) {
		try {
			File f = new File("datuak/aurikulares.txt");
			PrintWriter printWriter = new PrintWriter(f);

			for (int i = 0; i < stocks.length; i++) {
				printWriter.println(productos[i] + ";" + marcas[i] + ";" + precios[i] + ";" + stocks[i]);
			}
			printWriter.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
