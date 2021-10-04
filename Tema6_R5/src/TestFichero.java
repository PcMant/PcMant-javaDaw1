

import java.io.*;
public class TestFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FileOutputStream f= null;
		FileInputStream f = null;
		
		//String s = "En un lugar de la mancha de cuyo nombre no quiero acordarme..."; //output
		String s = ""; //input
		//char c=0; //input
		char c; //input
		try {
			//f=new FileOutputStream("datos.txt"); //output
			f=new FileInputStream("datos.txt"); //input
			int size = f.available(); //input
			//for(int i=0; i<s.length();i++) { //output
				//c=s.charAt(i); //output
				//f.write((byte)c); //output
			for(int i=0;i<size;i++) {	//input
				c=(char)f.read(); //input
				s=s+c; //input
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println(s); //Para mostrar la lectura input
			try {
				f.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
