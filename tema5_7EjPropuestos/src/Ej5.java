import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/*Ejercicio 5:
 * Realiza una clase conversorfechas que tenga los siguientes métodos:
 * -String normalToAmericano(String). Este método convierte una fecha en formato normal dd/mm/yyyy a
 * formato americano mm/dd/yyyy
 * -String americanoToNormal(String). Este método realiza el paso contrario, convierte fechas en formato
 * americano a formato normal.
 */
public class Ej5 {
	
	public static String normalToAmericano(String fech) {
		
		 SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
		 String strFecha = fech;
		 Date fecha = null;
		 try {

		     fecha = formatoDelTexto.parse(strFecha);

		 } catch (ParseException ex) {

		     ex.printStackTrace();

		 }
		
		return (new SimpleDateFormat("dd/MM/yyyy").format(fecha));
	}
	
	public static String americanoToNormal(String fech) {
		

		 SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		 String strFecha = fech;
		 Date fecha = null;
		 try {

		     fecha = formatoDelTexto.parse(strFecha);

		 } catch (ParseException ex) {

		     ex.printStackTrace();

		 }
		
		return (new SimpleDateFormat("MM/dd/yyyy").format(fecha));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ej5.americanoToNormal("08/12/1995"));
		System.out.println(Ej5.normalToAmericano("5/8/2002"));
	}

}
