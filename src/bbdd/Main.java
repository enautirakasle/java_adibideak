package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Main {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";

	public static void main(String[] args) {
		String nombre, apellido, dni, password;
		int id;
		boolean esAdmin;

		Connection conexion;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from usuarios");

			/*
			 * READ
			 * select guztiena eta pantailaratzea
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
			
			
			/*
			 * UPDATE
			 * update usuario batena
			 */
			
			PreparedStatement pstUpdate = conexion.prepareStatement("update usuarios set nombre=? where id=?");
			pstUpdate.setString(1, "bbbb");
			pstUpdate.setInt(2, 1);
			pstUpdate.executeUpdate();
			//update bukaera
			
			
			/*
			 * CREATE
			 * insert usuario batena
			 */
			
			PreparedStatement pstInsert = conexion.prepareStatement("INSERT INTO usuarios(nombre, apellido, dni, admin, password) VALUES (?, ? ,?, ?, ?)");
			pstInsert.setString(1, "aitor");
			pstInsert.setString(2, "badiola");
			pstInsert.setString(3, "11223344w");
			pstInsert.setBoolean(4, false);
			pstInsert.setString(5, "badiola2020");
			pstInsert.execute();
			//insert bukaera
			
			
			/*
			 * DELETE
			 * delete usuario batena
			 */
			PreparedStatement pstDelete = conexion.prepareStatement("DELETE FROM usuarios WHERE dni=?");
			pstDelete.setString(1, "22222222b");
			pstDelete.execute();
			//delete bukaera
			
			conexion.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
