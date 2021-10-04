/**
 *El programa crea un String con los datos que se quieren procesar y un array con la misma longitud que el
 *String anterior. Se utilizará un objeto flujoInput de la clase StringReader para leer el String carácter a caráter. Los
 *caracteres leido se van almacenando en el objeto FlujoOutput uno a uno hasta que se lee el carácter -1 que indica el
 *final del String. Una vez se han leido todos los caracteres se copian al array arr mediante el método toChartArray()
 *del objeto flujoOutput de la clase CharArrayWriter. Por último y no menos importante se cierran los flujos abierto
 *mediante los método close() de cada uno de ellos. 
 * 
 */

import java.io.*;

public class EjemploFlujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme, ");
		s = s + "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, ";
		s = s + "adarga antigua, rocín flaco y galgo corredor...";
		
		char [] arr = new char[s.length()];
		
		int car = 0;
		
		StringReader flujoInput = new StringReader(s);
		CharArrayWriter flujoOutput = new CharArrayWriter();
		
		try {
			while((car = flujoInput.read()) != -1) {
				flujoOutput.write(car);
			}
			arr = flujoOutput.toCharArray();
			System.out.println(arr);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			flujoInput.close();
			flujoOutput.close();
		}
	}

}
