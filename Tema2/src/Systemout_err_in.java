import java.util.Scanner;
import java.util.StringTokenizer;

public class Systemout_err_in {
	
	public static void main(String[] args){
		//Impresi�n de pantalla normal 
		System.out.println("Este es un mensaje normal");
		
		//Impresi�n de pantalla mensaje de error
		System.err.println("Esto es un mensaje de error");
		
		//Uso de System.in Este es para recoger informaci�n
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce cualquier valor o texto: ");
		String texto = teclado.nextLine();
		System.out.println(texto);
		StringTokenizer st = new StringTokenizer(texto);
		System.out.println ("N�mero de palabras introduccidas: "+st.countTokens());
		System.out.println("Caracteres: "+texto.length());
	}
}
