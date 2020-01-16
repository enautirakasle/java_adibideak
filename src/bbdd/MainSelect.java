package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainSelect {

	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public static void main(String[] args) {

		int id;
		String nombre, apellido, dni, password;
		boolean esAdmin;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from usuarios");

			/*
			 * READ select guztiena eta pantailaratzea
			 */
			System.out.println("Erabiltzaile guztien zerrenda:");
			System.out.println("**********************************************************************************");
			while (rs.next()) {
				id = rs.getInt("id");
				nombre = rs.getString("nombre");
				apellido = rs.getString("apellido");
				dni = rs.getString("dni");
				password = rs.getString("password");
				esAdmin = rs.getBoolean("admin");

				System.out.println("id: " + id + ", nombre: " + nombre + ", apellido: " + apellido + "" + ", dni: "
						+ dni + ", password: " + password + ", es admin: " + esAdmin);
			}
			System.out.println("**********************************************************************************");
			// select bukaera

			conexion.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
