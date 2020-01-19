package bbdd.liburutegia.socio;

import java.sql.Connection;
import java.util.Scanner;

public class MainSocio {
	// TODO bete konstanteak
		private static final String HOST = "";
		private static final String BBDD = "";
		private static final String USERNAME = "";
		private static final String PASSWORD = "";

		// TODO menuko aukerak hemen jarri
		private static final int SALIR = 0;
		private static final int LISTAR_SOCIOS = 1;
		// .............................
		// ....................

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);

			int aukera;
			do {
				menuPrincipal();

				aukera = Integer.parseInt(scan.nextLine());

				switch (aukera) {
				case LISTAR_SOCIOS:
					listarSocios();

					break;
				// TODO beste case guztiak hemen
				/*
				 * 
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

	

		private static void listarSocios() {
			// TODO todo lo referente a listar socios va aqui
			/*
			 * se creara un Objeto de tipo ModeloSocio
			 * se ejecutara selectAll() de ModeloSocio
			 * se recorrera el arrayList que devuelve mostrando todos los socios en pantalla
			 */
			
			
		}



		private static void menuPrincipal() {
			// TODO menua hemen marraztuko da

		}

}
