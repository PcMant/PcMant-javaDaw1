/*Programa que convierte de grados celsius a farenheit y viceversa*/
import java.util.Scanner;

public class Temperatura {
	
	//Deficinción de funciones
	public static double celsiusAfarenheit(double t){ //define una función
		return (1.8)*t + 32;	
	}
	
	public static double farenheitAcelsius(double t){
		return (t-32)/1.8;
	}

	public static void main(String[] args){
		
		//Deficinicón de variables
		double temp;
		int op1=0;
		Scanner teclado = new Scanner(System.in);
		
		//Algoritmo
		System.out.println("=Menú conversiones de temperatura=");
		System.out.println("1.Convertir de Celsius a Farenheit");
		System.out.println("2.Convertir de Farenheit a Celsius");
		System.out.println();
		System.out.print("Selecciona una opción del menu: ");
		op1 = teclado.nextInt(); //Entrada de un dato
		
		switch(op1){
			case 1:
				System.out.print("Introducce la temperatura en Celsius a convertir: ");
				temp = teclado.nextDouble(); // Entrada de un dato
				System.out.println("A "+temp+"ºC "+"le corresponden "+celsiusAfarenheit(temp)+"ºF");
				break;
			case 2:
				System.out.print("Introducce la temperatura en farenheit a convertir: ");
				temp = teclado.nextDouble(); //Entrada de un dato
				System.out.println("A "+temp+"ºF le corresponden "+farenheitAcelsius(temp)+"ºC");
				break;
			default: System.out.println("Opción seleccionada incorrecta.");
		}
	}
}
