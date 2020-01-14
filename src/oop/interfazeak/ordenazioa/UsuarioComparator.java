package oop.interfazeak.ordenazioa;

import java.util.Comparator;

public class UsuarioComparator implements Comparator<Usuario>{


	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}
	

}
