package bbdd.liburutegia.socio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bbdd.Usuario;

public class ModeloSocio extends Conexion{

	public ModeloSocio(String host, String bbdd, String usuario, String contrasenia) {
		super(host, bbdd, usuario, contrasenia);
	}
	
	/*
	 * socio guztiak datu basetik irakurri
	 * eta arraylist batean sartzen ditu
	 * arraylist hori itzultzen du
	 */
	public ArrayList<Socio> selectAll(){

		ArrayList<Socio> socios = new ArrayList<Socio>();
		Statement st;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from socios");

			Socio socio;
			while (rs.next()) {
				
				socio = new Socio();
				socio.setId(rs.getInt("id"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("nombre"));
				socio.setDni(rs.getString("nombre"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				
				socios.add(socio);
				
			}
			return socios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return socios;
		
	}

	public ArrayList<Socio> selectLike(String parte) {
		// TODO Auto-generated method stub
		return null;
	}

	public Socio select(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String dni) {
		// TODO Auto-generated method stub
		
	}

	public void update(Socio socio) {
		// TODO Auto-generated method stub
		
	}

}
