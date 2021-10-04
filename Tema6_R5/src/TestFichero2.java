import java.io.File;

public class TestFichero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//las rutas separan con doble barra invertida en Windows
		File dir = new File(".");

		if(dir.exists()) {
			System.out.println("Existe el directorio "+dir.getName());
		}else {
			System.out.println("El directorio no existe");
		}
		
		if(dir.canRead())
			System.out.println("El directorio existe y tiene permiso de lectura");
		if(dir.canWrite())
			System.out.println("El directorio existe y tiene permiso de escritura");
		
		File[] ficheros = dir.listFiles();
		
		for(File f:ficheros) {
			System.out.println(f.getName());
		}
	}

}
