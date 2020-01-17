package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

public class MainCreate {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public static void main(String[] args) {
	

		Connection conexion;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
			
			Usuario usuario = leerUsuario();
			
			PreparedStatement pstInsert = conexion.prepareStatement("INSERT INTO usuarios(nombre, apellido, dni, admin, password) VALUES (?, ? ,?, ?, ?)");
			pstInsert.setString(1, usuario.getNombre());
			pstInsert.setString(2, usuario.getApellido());
			pstInsert.setString(3, usuario.getDni());
			pstInsert.setBoolean(4, usuario.isAdmin());
			pstInsert.setString(5, usuario.getPassword());
			pstInsert.execute();

			conexion.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static Usuario leerUsuario() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre");
		String nombre = scan.nextLine();
		System.out.println("Escribe el apellid");
		String apellido = scan.nextLine();
		System.out.println("Escribe el dni");
		String dni = scan.nextLine();
		System.out.println("Escribe el password");
		String password = scan.nextLine();
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setDni(dni);
		usuario.setPassword(password);
		usuario.setAdmin(false);
		
		return usuario;
	}
}
