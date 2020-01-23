package bbdd.liburutegia.socio;

import java.util.ArrayList;

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
		//TODO oinarritu MainSelect edo listarLibros funtzionalitatean
		return null;
		
	}

}
