/*Programa que recoge un n?mero del 1-7 y devuelve a que dia de la semana pertenece*/
import java.util.Scanner;

public class diaSemana {
	
	public static void main(String[] arg) {
		
		//Sentencia para pedir datos por teclado guardado en la variable teclado para facilitar programar
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introducce un n?mero del 1-7: ");
		
		//Se recoge por teclado un valor Int guardado en una variable definida tipo Int
		int numeroDia = teclado.nextInt();
		
		//Comprueba el valor recogido en la variable anterior para devolver a que dia de la semana pertenece
		switch(numeroDia) {
			case 1: System.out.println("El n?mero introduccido corresponde al Lunes.");break;
			case 2: System.out.println("El n?mero introduccido corresponde al Martes.");break;
			case 3: System.out.println("El n?mero introduccido corresponde al Miercoles.");break;
			case 4: System.out.println("El n?mero introduccido corresponde al Jueves.");break;
			case 5: System.out.println("El n?mero introduccido corresponde al Viernes.");break;
			case 6: System.out.println("El n?mero introduccido corresponde al Sabado.");break;
			case 7: System.out.println("El n?mero introduccido corresponde al Domingo.");break;
			default: System.out.println("El n?mero introduccido no corresponde a ning?n dia de la semana.");
		}
		
	}

}
