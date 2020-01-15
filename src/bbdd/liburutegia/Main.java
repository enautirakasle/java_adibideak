package bbdd.liburutegia;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
	// TODO bete konstanteak
	private static final String HOST = "";
	private static final String BBDD = "";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";

	// TODO menuko aukerak hemen jarri
	private static final int SALIR = 0;
	private static final int LISTAR_LIBROS = 1;
	// .............................
	// ....................

	public static void main(String[] args) {
		
		//TODO datu basera conexioa egin
		Connection conexion = null;
		/*
		 * 
		 * ...............
		 */
		
		
		Scanner scan = new Scanner(System.in);

		int aukera;
		do {
			menuPrincipal();

			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case LISTAR_LIBROS:
				listarLibros(conexion);

				break;
			// TODO beste case guztiak hemen
			/*
			 * case BUSCAR_LIBROS: buscarLibros();
			 * 
			 * 
			 */
			case SALIR:
				System.out.println("El programa se ha cerrado....");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (aukera != SALIR);
	}

	private static void listarLibros(Connection conexion) {
		// TODO hau egiteko
		/*
		 * datu basera conexioa 
		 * parametro bezala jaso duela
		 * kontuan izan 
		 */

	}

	private static void menuPrincipal() {
		// TODO menua hemen marraztuko da

	}

}
