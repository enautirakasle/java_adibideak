package bbdd.liburutegia.socio;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainSocio {
	// TODO bete konstanteak
		private static final String HOST = "localhost";
		private static final String BBDD = "biblioteca";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";

		// TODO menuko aukerak hemen jarri
		private static final int SALIR = 0;
		private static final int LISTAR_SOCIOS = 1;
		private static final int BUSCAR_SOCIOS = 2;
		private static final int VER_SOCIO = 3;
		private static final int EDITAR_SOCIO = 4;
		private static final int ELIMINAR_SOCIO = 5;
		


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
				case BUSCAR_SOCIOS:
					buscarSocios(scan);
					break;
				case VER_SOCIO:
					verSocio(scan);
					break;
				case EDITAR_SOCIO:
					editarSocio(scan);
					break;
				case ELIMINAR_SOCIO:
					eliminarSocio(scan);
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


		/*
		 * funcionalidades del programa
		 */
		private static void listarSocios() {
			ModeloSocio modeloSocio = new ModeloSocio(HOST, BBDD, USERNAME, PASSWORD);
			ArrayList<Socio> socios = modeloSocio.selectAll();
			imprimirSocios(socios);
		}
		
		private static void buscarSocios(Scanner scan) {
			System.out.println("Introduce algo para realizar la busqueda");
			String parte = scan.nextLine();
			
			ModeloSocio modeloSocio = new ModeloSocio(HOST, BBDD, USERNAME, PASSWORD);
			ArrayList<Socio> socios = modeloSocio.selectLike(parte);
			imprimirSocios(socios);
		}
		
		private static void verSocio(Scanner scan) {
			System.out.println("Introduce un dni para ver la informacion del socio");
			String dni = scan.nextLine();
			
			ModeloSocio modeloSocio = new ModeloSocio(HOST, BBDD, USERNAME, PASSWORD);
			Socio socio = modeloSocio.select(dni);
			System.out.println(socio);
			
		}
		
		private static void editarSocio(Scanner scan) {
			System.out.println("Introduce un dni para editar la informacion del socio");
			String dni = scan.nextLine();
			
			//traemos de la BBDD el socio que editaremos
			ModeloSocio modeloSocio = new ModeloSocio(HOST, BBDD, USERNAME, PASSWORD);
			Socio socio = modeloSocio.select(dni);
			
			//el usuario introduce los nuevos datos y las recogemos en variables
			System.out.println("Introduce la nueva direccion");
			String direccionNueva = scan.nextLine();
			
			System.out.println("Introduce la nueva poblacion");
			String poblacionNueva = scan.nextLine();
			
			System.out.println("Introduce la nueva provincia");
			String provinciaNueva = scan.nextLine();
			
			//editamos el socio
			socio.setDireccion(direccionNueva);
			socio.setPoblacion(poblacionNueva);
			socio.setProvincia(provinciaNueva);
			
			//cambiamos el socio en la BBDD
			modeloSocio.update(socio);
			
			//informamos al usuario que la accion se ha realizado
			System.out.println("Socio cambiado");
			System.out.println(socio);
			
		}


		private static void eliminarSocio(Scanner scan) {
			System.out.println("Introduce un dni para eliminar el socio");
			String dni = scan.nextLine();
			
			ModeloSocio modeloSocio = new ModeloSocio(HOST, BBDD, USERNAME, PASSWORD);
			modeloSocio.delete(dni);
			System.out.println("Socio eliminado: " + dni);
			
		}



		/**
		 * socios arraylista errekorritu eta socio guztiak pantailan aterako ditu
		 * @param socios Socio motako objektuz osatutako ArraLista
		 */
		private static void imprimirSocios(ArrayList<Socio> socios) {
			Iterator<Socio> i = socios.iterator();
			
			while(i.hasNext()){
				System.out.println(i.next());
			}
			
		}



		private static void menuPrincipal() {
			System.out.println("--------------\n----Menu------\n"
					+LISTAR_SOCIOS + "- listar socios\n"
					+BUSCAR_SOCIOS + "- buscar socios\n"
					+VER_SOCIO + "- ver socio\n"
					+EDITAR_SOCIO + "- editar socio\n"
					+ELIMINAR_SOCIO + "- eliminar socio\n");

		}

}
