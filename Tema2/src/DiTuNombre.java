import java.util.Scanner;

public class DiTuNombre {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduce tu primer apellido: ");
		String apellido1 = teclado.nextLine();
		System.out.print("Introduce tu segundo apellido: ");
		String apellido2 = teclado.nextLine();
		System.out.println("Tu nombre es completo es: "+nombre+" "+apellido1+" "+apellido2);
		System.out.print("Las iniciales son: ");
		System.out.print(nombre.charAt(0));
		System.out.print(apellido1.charAt(0));
		System.out.print(apellido2.charAt(0));
		
		
	}

}
