/*
 * El programa tiene almacenado una serie de personas en una estructura amigos que es un vector de objetos String.
 * Los datos en este vector se graban en un fichero "amigos.txt", cada persona en una línea y para ello se graba en el
 * fichero el retorno de carro y línea "\r\n" (\r es el retorno de carro y \n es el carácter de nueva línea).
 * 
 * Para la lectura del fichero se utiliza un objeto FileReader.Como queremos leer línea a línea utilizamos un objeto de la
 * clase BufferedReader que tiene el método readLine(), que permite leer una línea de un flujo de entrada. La clase
 * BufferedReader es un reader.
 */

import java.io.*;
public class TestFichero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] amigos= {"Andrés Rosique","Pedro Ruiz","Issac Sanchez","Juan Serrano"};
		
		File fs = new File ("amigos.txt");
		try {
			FileWriter fw = new FileWriter(fs);
			for(String s:amigos) {
				fw.write(s,0,s.length());
				fw.write("\r\n");
			}
			if(fw!=null) fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		File fe = new File("amigos.txt");
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String s;
				while((s=br.readLine())!=null) {
					System.out.println(s);
				}
				if(fr!=null) fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
