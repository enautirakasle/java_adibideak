package bbdd.liburutegia.prestamo;

import java.util.ArrayList;
import java.util.Iterator;

public class PrestamosProbak {

	public static void main(String[] args) {
		ModeloPrestamo pm = new ModeloPrestamo("localhost", "biblioteca", "root", "");
		ArrayList<Prestamo> prestamos= pm.selectAll();
		
		Iterator<Prestamo> it = prestamos.iterator();
		while (it.hasNext()) {
			Prestamo prestamo = (Prestamo) it.next();
			System.out.println(prestamo);
			
		}

	}

}
