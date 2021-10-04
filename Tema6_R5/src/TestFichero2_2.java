

import java.io.*;
public class TestFichero2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] amigos= {"Andr�s Rosique","Pedro Ruiz","Issac Sanchez","Juan Serrano"};
		long[] telefonos= {653364787,627463746,644567346,623746348};
		
		//estructura del fichero
		try {
			FileOutputStream fs = new FileOutputStream("amigos.txt");
			DataOutputStream d = new DataOutputStream(fs);
			for(int i=0;i<4;i++) {
				d.writeUTF(amigos[i]);
				d.writeLong(telefonos[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//lectura de fichero
		try {
			FileInputStream fe = null;
			DataInputStream d = null;
			try {
				File f=null;
				f=new File("amigos.txt");
				if(f.exists()) {
					fe = new FileInputStream(f);
					d = new DataInputStream(fe);
					String s;
					Long l;
					while(true) {
						s = d.readUTF();
						System.out.print(s+" -> ");
						l = d.readLong();
						System.out.println(l);
					}
				}
			}catch(EOFException eof) {
				System.out.println("------------------------------------------------------");
			}catch(FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado "+fnf);
			}catch(IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			}catch (Throwable e) {
				System.err.println("Error de programa: "+e);
				e.printStackTrace();
			}finally {
				if(d!=null) {
					d.close();
					fe.close();
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
