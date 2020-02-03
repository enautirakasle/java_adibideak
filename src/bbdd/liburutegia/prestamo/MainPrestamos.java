package bbdd.liburutegia.prestamo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import bbdd.liburutegia.Libro;

public class MainPrestamos {

		//bete konstanteak
		private static final String HOST = "localhost";
		private static final String BBDD = "biblioteca";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";

		//menuko aukerak hemen jarri
		private static final int SALIR = 0;
		private static final int VER_PRESTAMOS = 1;
		private static final int VER_PRESTAMOS_DE_SOCIO = 2;
		private static final int VER_PRESTAMOS_DE_LIBRO = 3;
		private static final int REALIZAR_PRESTAMO = 4;
		private static final int DEVOLVER_LIBRO = 5;
		


		public static void main(String[] args) {
			
		
			Scanner scan = new Scanner(System.in);

			int aukera;
			do {
				menuPrincipal();

				aukera = Integer.parseInt(scan.nextLine());

				switch (aukera) {
				case VER_PRESTAMOS:
					verTodosLosPrestamos();
					break;
				case VER_PRESTAMOS_DE_LIBRO:
					verPrestamosDeLibro(scan);
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

		
		private static void verPrestamosDeLibro(Scanner scan) {
			System.out.println("Idatzi liburuaren tituloa");
			String titulo = scan.nextLine();
			
			ModeloLibro ml = new ModeloLibro(HOST, BBDD, USERNAME, PASSWORD);
			
			Libro libro = ml.selectLibro(titulo);
			
			ModeloPrestamo mp = new ModeloPrestamo(HOST, BBDD, USERNAME, PASSWORD);
			ArrayList<Prestamo> prestamos = mp.prestamosDeLibro(libro.getId());
			
			imprimirPrestamos(prestamos);
			
		}


		private static void verTodosLosPrestamos() {
			ModeloPrestamo mp = new ModeloPrestamo(HOST, BBDD, USERNAME, PASSWORD);
			ArrayList<Prestamo> prestamos = mp.selectAll();
			imprimirPrestamos(prestamos);
		}

		private static void imprimirPrestamos(ArrayList<Prestamo> prestamos) {
			Iterator<Prestamo> it = prestamos.iterator();
			while (it.hasNext()) {
				Prestamo prestamo = (Prestamo) it.next();
				System.out.println(prestamo);
				
			}
			
		}






		private static void menuPrincipal() {
			System.out.println("\n---Menu---");
			System.out.println(VER_PRESTAMOS + "- listar prestamos");
//			System.out.println(VER_PRESTAMOS_DE_SOCIO + "- ver prestamos de socio");
			System.out.println(VER_PRESTAMOS_DE_LIBRO + "- ver prestamos de libro");
//			System.out.println(REALIZAR_PRESTAMO + "- realizar prestamo");
//			System.out.println(DEVOLVER_LIBRO + "- devolver libro");

		}

}
