package bbdd.liburutegia.prestamo;

import java.util.Date;

import bbdd.liburutegia.Libro;
import bbdd.liburutegia.socio.Socio;

public class Prestamo {

	private Date fecha;
	private boolean devuelto;
	
	private Socio socio;
	private Libro libro;
	

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	
	

}
