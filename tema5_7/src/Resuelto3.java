import java.util.Calendar;
import java.util.GregorianCalendar;

/*Ejercicio resuleto 3:
 * Realiza una función que dada la fecha de nacimiento de una persona indique cuántos años tiene.
 */
public class Resuelto3 {
	
	public static int edad(String fecha_nac) {
		//Importante: fecha_nac tiene que tener el formato dd/MM/yyyy
		java.util.Date hoy = new java.util.Date(); //Fecha actual
		String[] tokens = fecha_nac.split("/");
		Calendar cal = new GregorianCalendar(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1])-1, Integer.parseInt(tokens[0]));
		//Se resta 1 porque los meses comienzan en 0
		java.sql.Date fecha = new java.sql.Date(cal.getTimeInMillis());
		long diferencia = (hoy.getTime()-fecha.getTime())/(24*60*60*1000);
		//Se divide por los milisegundos que tiene un día. Se obtiene la diferencia en días
		return (int)diferencia/365;
	}
	
	public static void main(String[] args) {
		Resuelto3 miedad = new Resuelto3();
		System.out.println("La edad es: "+miedad.edad("22/08/1995"));
	}

}
