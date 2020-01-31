package bbdd.liburutegia.prestamo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bbdd.liburutegia.Libro;
import bbdd.liburutegia.socio.Socio;



public class ModeloPrestamo extends Conexion{
	
	public ModeloPrestamo(String host, String bbdd, String usuario, String contrasenia) {
		super(host, bbdd, usuario, contrasenia);
	}

	public ArrayList<Prestamo> selectAll(){
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		/*
		 * SELECT prestamos.*, libros.titulo, libros.autor, libros.num_pag, socios.nombre, socios.apellido, socios.dni, socios.direccion, socios.poblacion, socios.provincia 
		 * FROM (prestamos join libros on prestamos.id_libro=libros.id) join socios on prestamos.id_socio=socios.id
		 */
		Statement st;
		try {
			st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT prestamos.*, libros.titulo, libros.autor, libros.num_pag, socios.nombre, socios.apellido, socios.dni, socios.direccion, socios.poblacion, socios.provincia "
					+ "FROM (prestamos join libros on prestamos.id_libro=libros.id) join socios on prestamos.id_socio=socios.id");
			
			while(rs.next()){
				Prestamo prestamo = new Prestamo();
				prestamo.setFecha(rs.getDate("fecha"));
				prestamo.setDevuelto(rs.getBoolean("devuelto"));
				
				Libro libro = new Libro();
				libro.setId(rs.getInt("id_libro"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setNumeroPaginas(rs.getInt("num_pag"));
				prestamo.setLibro(libro);
				
				Socio socio = new Socio();
				socio.setId(rs.getInt("id_socio"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDni(rs.getString("dni"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				prestamo.setSocio(socio);
				
				prestamos.add(prestamo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prestamos;
	}

}
