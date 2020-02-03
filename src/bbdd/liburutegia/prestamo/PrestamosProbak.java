package bbdd.liburutegia.prestamo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import bbdd.liburutegia.Libro;
import bbdd.liburutegia.socio.Socio;

public class PrestamosProbak {

	public static void main(String[] args) {

		ModeloPrestamo pm = new ModeloPrestamo("localhost", "biblioteca", "root", "");

		ArrayList<Prestamo> prestamos = pm.prestamosDeLibro(17);

		Iterator<Prestamo> it = prestamos.iterator();
		while (it.hasNext()) {
			Prestamo prestamo = (Prestamo) it.next();
			System.out.println(prestamo);
		}

	}

}
