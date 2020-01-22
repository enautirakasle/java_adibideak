package bbdd.liburutegia;

import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	// TODO bete konstanteak
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	// TODO menuko aukerak hemen jarri
	private static final int SALIR = 0;
	private static final int LISTAR_LIBROS = 1;
	private static final int BUSCAR = 2;
	private static final int EDITAR_LIBRO = 3;
	// ....................

	public static void main(String[] args) {
		
		//TODO datu basera conexioa egin
		Connection conexion = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		Scanner scan = new Scanner(System.in);

		int aukera;
		do {
			menuPrincipal();

			aukera = Integer.parseInt(scan.nextLine());

			switch (aukera) {
			case LISTAR_LIBROS:
				listarLibros(conexion);

				break;
			case BUSCAR:
				System.out.println("Escribe algo para realizar la busqueda");
				String parte = scan.nextLine();
				
				listarLibrosCon(parte, conexion);
				break;
			case EDITAR_LIBRO:
				System.out.println("Introduce un titulo para editar el libro");
				String titulo = scan.nextLine();
				
				verLibro(titulo, conexion);
				
				System.out.println("Introduce el numero de paginas");
				int numeroDePaginas = Integer.parseInt(scan.nextLine());
				
				editarLibro(titulo, numeroDePaginas, conexion);
				break;
			
			case SALIR:
				System.out.println("El programa se ha cerrado....");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (aukera != SALIR);
		
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void editarLibro(String titulo, int numeroDePaginas, Connection conexion) {
		// TODO Auto-generated method stub
		
	}

	private static void verLibro(String titulo, Connection conexion) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * listara los libros que tengan parteTitulo en el titulo
	 * @param parteTitulo String para realizar la busqueda de libros
	 * @param conexion conexion a una BBDD de mysql
	 */
	private static void listarLibrosCon(String parte, Connection conexion) {
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement("select * from libros where titulo like ? or autor like ?");
			preparedStatement.setString(1, "%" + parte + "%");
			preparedStatement.setString(2, "%" + parte + "%");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			listarResultSetDeLibros(resultSet);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}
	
	private static void listarLibros(Connection conexion) {
		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from libros");
			
			listarResultSetDeLibros(resultSet);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void listarResultSetDeLibros(ResultSet resultSet) {
		Libro libro = null;
		try {
			while(resultSet.next()){
				libro = new Libro();
				libro.setId(resultSet.getInt("id"));
				libro.setTitulo(resultSet.getString("titulo"));
				libro.setAutor(resultSet.getString("autor"));
				libro.setNumeroPaginas(resultSet.getInt("num_pag"));
				
				System.out.println(libro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	private static void menuPrincipal() {
		System.out.println("\n---Menu---");
		System.out.println(LISTAR_LIBROS + "- listar libros");
		System.out.println(BUSCAR + "- buscar libros");
		System.out.println(EDITAR_LIBRO + "- editar libro");

	}

}
