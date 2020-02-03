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
		try {
			ModeloPrestamo pm = new ModeloPrestamo("localhost", "biblioteca", "root", "");

			Prestamo prestamo = new Prestamo();

			Libro libro = new Libro();
			libro.setId(10);
			prestamo.setLibro(libro);

			Socio socio = new Socio();
			socio.setId(2);
			prestamo.setSocio(socio);

			// 2018-04-16
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha = sdf.parse("2018-04-16");
			prestamo.setFecha(fecha);

			pm.finalizar(prestamo);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
