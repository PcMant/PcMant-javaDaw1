package java1;

public class bucles {

	public static void main(String[] arg) {
		//bucle for
		System.out.println("1 AL 10 CON BUCLE FOR:");
		for(int i=1; i<=10; i++) {
			System.out.println("Varlor de i es: "+i);
		}
		
		//bucle while
		System.out.println();
		System.out.println("1 AL 5 CON BUCLE WHILE");
		int i=1;
		while(i<6) {
			System.out.println(i+" ");
			i++;
		}
		
		//bucle for each
		System.out.println();
		System.out.println("MOSTRANDO NOMBRES MEDIANTE BUCLE FOR EACH A PARTIR DE UN ARRAY:");
		String[] lista= {"Juan","Pedro","Manuel","Ana","Maria","Juaquin"};
		for(String x:lista) {
			System.out.println(x);
		}
	}
}
