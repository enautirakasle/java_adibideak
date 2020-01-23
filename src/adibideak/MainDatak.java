package adibideak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Ejemplo de utilización de Date y SimpleDateFormat
 * video de ayuda: https://www.youtube.com/watch?v=GGFLTLMJ6Lo
 * 
 * documentacion oficial de SimpleDateFormat https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 * para ver por que 'yyyy' 'MM' etc....
 */
public class MainDatak {

	public static void main(String[] args) {
		/*
		 * escritura de fecha
		 */
		Date fecha = new Date();//crea un obejo de tipo Date con la fecha y hora actuales.
		
		System.out.println(fecha);//implesion de una fecha sin formato.
		
		//con un objeto de tipo SimpleDateFormat especificamos un formato para la fecha
		SimpleDateFormat formatoFecha1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String fechaConFormato1 = formatoFecha1.format(fecha); //pasa la fecha a string con el formato especificado arriva
		System.out.println(fechaConFormato1);//impresion de una fecha con formato
		

		//lo mismo con otro formato pero el codigo mas reducido.
		SimpleDateFormat formatoFecha2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(formatoFecha2.format(fecha));//impresion de una fecha con otro formato.
		System.out.println("-----------Fin escritura fechas---------------------\n\n");
		
		/*
		 * lectura de fecha por teclado
		 */

		try {
			//especificamos en que formato vamos a introducir las fecha por el teclado
			SimpleDateFormat formatoLectura1 = new SimpleDateFormat("dd-MM-yyyy");
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Escribe una fecha en formato dd-MM-yyyy (ejmplo: 23-01-2020)");
			String stringFecha = scan.nextLine();
			Date fechaLeida = formatoLectura1.parse(stringFecha);
			
			System.out.println(fechaLeida);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
