/*
 *Utilizaci�n PushbackReader.
 *En este programa se sustituyen los operadores de decremento (b++) por una asignaci�n y una suma (b=b+1),
 *teniendo en cuenta que las variables est�n definidas solo con una letra. N�tese que cuando el programa
 *se encuentra con un crar�cter '+' mira en el flujo si hay otro car�cter '+' y, si no es as�, lo devuelve
 *al flujo mediante el m�todo unread();
 * 
 */

import java.io.*;
public class ejemploPushbackReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String sentencias = "a=a+1;c++;b+=5;c=a+b;b++;";
		StringReader sr = new StringReader(sentencias);
		PushbackReader pbr = new PushbackReader(sr);
		int ultimo=pbr.read(), penultimo=0;
		while(ultimo!=-1) {
			switch(ultimo) {
				case '+':
					if((ultimo = pbr.read())== '+') {
						System.out.print("="+(char) penultimo+"+1");
					}else {
						pbr.unread(ultimo);
						System.out.print('+');
					}
					break;
				case ';':
					System.out.println((char)ultimo);
					break;
				default:
					System.out.print((char) ultimo);
			}
			penultimo=ultimo;
			ultimo=pbr.read();
		}
	}

}
