package oop.interfazeak.ordenazioa;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario();
		u1.setNombre("Anable");
		u1.setApellido("San Emeterio");
		
		Usuario u2 = new Usuario();
		u2.setNombre("Eider");
		u2.setApellido("Galarraga");
		
		usuarios.add(u1);
		usuarios.add(u2);
		
		for (Iterator iterator = usuarios.iterator(); iterator.hasNext();) {
			Usuario usuario = (Usuario) iterator.next();
			System.out.println(usuario);
			
		}
		System.out.println();
		usuarios.sort(new UsuarioComparator());
		
		for (Iterator iterator = usuarios.iterator(); iterator.hasNext();) {
			Usuario usuario = (Usuario) iterator.next();
			System.out.println(usuario);
			
		}

	}

}
