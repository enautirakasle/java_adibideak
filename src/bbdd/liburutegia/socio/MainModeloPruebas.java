package bbdd.liburutegia.socio;

import java.util.ArrayList;

public class MainModeloPruebas {

	public static void main(String[] args) {
		ModeloSocio ms = new ModeloSocio("localhost", "biblioteca", "root", "");
		ArrayList<Socio> socios = ms.selectAll();
		
		System.out.println(socios);
		

	}

}
