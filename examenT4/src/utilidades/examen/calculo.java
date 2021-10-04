package utilidades.examen;

public class calculo {
	
	private static int media;

	public static int media(int n1, int n2, int n3) { //Clase que hace nota media
		
		media = (n1+n2+n3)/3;
		
		return  media;
		
	}
	
	public static void printMedia() { //Imprime medias
		System.out.println(media);
	}
}
