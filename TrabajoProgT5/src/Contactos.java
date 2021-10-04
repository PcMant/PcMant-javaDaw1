import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Contactos {
	
	Contactos(){
		System.out.println("====Contactos====");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando e inicializando las variables
		Contactos con = new Contactos(); 
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cantidad de contactos a introducir: ");
		
		int cantidad = teclado.nextInt();
		String[] amigos = new String[cantidad];
		long[] telefonos = new long[cantidad];
		
		//Introduciendo de contactos
		for(int i=0; i<=cantidad-1; i++) {
			System.out.print("Introduce el nombre: ");
			amigos[i]= teclado.next();
			System.out.print("Introduce el número de "+amigos[i]+": ");
			telefonos[i]= teclado.nextLong();
		}
		
		System.out.println("--------------------------------");
		System.out.println("======Contactos guardados=======");
		
		//escritura del fichero
		try {
			FileOutputStream fs=new FileOutputStream("contactos.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			for(int i=0;i<=cantidad-1;i++) {
				Contacto a = new Contacto(amigos[i],telefonos[i]);
				oos.writeObject(a);
			}
			if(oos!=null) {
				oos.close();
				fs.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//lectura del fichero
		try {
			File f=null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			try {
				f = new File("contactos.txt");
				if(f.exists()) {
					fe = new FileInputStream(f);
					ois = new ObjectInputStream(fe);
					while(true) {
						Contacto a = null;
						a = (Contacto)ois.readObject();
						a.print();
						System.out.println("");
					}
				}
			}catch(EOFException eof) {
				System.out.println("--------------------------------");
			}catch(FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado "+fnf);
			}catch(IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			}catch(Throwable e) {
				System.err.println("Error de programa"+e);
				e.printStackTrace();
			}finally {
				if(ois !=null) {
					ois.close();
					fe.close();
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}