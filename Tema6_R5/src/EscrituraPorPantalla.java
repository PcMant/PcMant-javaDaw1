/*
 * El programa utiliza el objeto PrintWriter el cual es redirigido a la pantalla. Tambi�n se utilizan
 * los m�todos write, print,prinln y flush de este m�todo. El m�todo flush vacia el buffer de contenido.
 */
import java.io.*;

public class EscrituraPorPantalla {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		PrintWriter pantalla = new PrintWriter(System.out);
		char[] array = {'M','o','r','e','n','o'};
		String str = new String("Juan Carlos");
		pantalla.write(str);
		pantalla.print(" ");
		pantalla.write(array, 0, 6);
		pantalla.println("");
		pantalla.flush();
	}

}
