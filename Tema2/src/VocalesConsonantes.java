/*Programa que comprueba si es vocal o consonante una letra introduccida por teclado*/
import java.util.Scanner;

public class VocalesConsonantes {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un carácter: ");
		char letra = teclado.next().charAt(0);
		
		if(letra == 'a' || letra == 'e'|| letra == 'i' || letra == 'o' || letra == 'u'|| letra == 'A' || letra == 'E' || letra == 'I'|| letra == 'O' || letra == 'U') {
			System.out.println("La letra es vocal");
		}else {
			System.out.println("La letra es consonante o cualquier otro tipo de caracter no vocal.");
		}
	}
}
