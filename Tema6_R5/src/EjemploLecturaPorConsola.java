/**
 * El programa lee cadenas por teclado y las repita por pantalla hasta que se escribe "para".
 */

import java.io.*;

public class EjemploLecturaPorConsola {
	
	public static String leercadena() {
		String cad="";
		BufferedReader br;
		
		/*
		 * En esta línea se crea un objeto BufferedReader que contiene el método readLine(), el cual devuelve una línea
		 * compleata del buffer. Este objeto en su constructor pide un Reader, para lo cual utilizamos un objeto InputStreamReader
		 * que a su vez, pide en su constructor un InputStream(el objeto System.in).
		 * */
		br = new BufferedReader (new InputStreamReader(System.in));
		
		
		try {
			cad = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return cad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad;
		System.out.println("Este programa hace eco hasta que escribas para");
		
		do {
			cad = leercadena();
			System.out.println(cad);
		}while(!cad.equals("para"));
	}

}
